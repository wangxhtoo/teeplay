package org.teeplay.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import com.alibaba.druid.support.json.JSONParser;
import com.alibaba.fastjson.serializer.InetAddressCodec;
import com.google.common.net.InetAddresses;

public class HttpClientPost {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String detail = "http://vote.zazhipu.com/Home/ActivityDetail/bc8e2d7f-c088-4429-99ef-dac388f21a19";
		String url = "http://vote.zazhipu.com/Client/DoVote";
		String data = "ID=bc8e2d7f-c088-4429-99ef-dac388f21a19&Name=j1jjj&QQ=8237847837&Email=he22334@163.com";
		boolean hcu = HttpClientPost.post(url, data, 1000);
		System.out.println(hcu + "");
	}

	public static boolean post(String serverUrl, String data, long timeout) {
		StringBuilder responseBuilder = null;
		BufferedReader reader = null;
		OutputStreamWriter wr = null;
//		String ip = "183.222.155.205";
		URL url;
		try {
			url = new URL(serverUrl);
			
//			String str[] = ip.split("\\.");
//            byte[] b =new byte[str.length];
//            for(int i=0,len=str.length;i<len;i++){
//                b[i] = (byte)(Integer.parseInt(str[i],10));
//            }
//			Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress(InetAddress.getByAddress(b) , 8123));
//			
			URLConnection conn = url.openConnection();
//			HttpHost proxyServer = new HttpHost("183.222.155.205",8123);
			
			conn.setDoOutput(true);
			conn.setConnectTimeout(1000 * 5);
			wr = new OutputStreamWriter(conn.getOutputStream());

			wr.write(data);
			wr.flush();

//			if (LOG.isDebugEnabled()) {
				reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				responseBuilder = new StringBuilder();
				StringBuilder json = new StringBuilder();
				String line = null;
				while ((line = reader.readLine()) != null) {
					responseBuilder.append(line + "\n");
					json.append(line);
				}
				if(responseBuilder.toString().startsWith("{")){
					JSONParser jp = new JSONParser(json.toString());
					Map<String,Object> maps = jp.parseMap();
					Integer code = Integer.parseInt(String.valueOf(maps.get("ReCode")));
					switch (code) {
					case 1000:
						System.out.println("投票成功");
						break;
					case 1003:
						System.out.println("已经投过票了");
						break;
					case 1004:
						System.out.println("投票失败，凌晨1-5点投票通道关闭");
						break;
					case 1804:
						System.out.println("时段票量已满");
						break;
					case 1805:
						System.out.println(maps.get("ReData"));
						break;
					default:
						break;
					}
				}else{
					System.out.println(responseBuilder.toString());
				}
				
//				System.out.println(maps.get("ReData") + "===" +  maps.get("ReCode") + "===" +  maps.get("ReMsg"));
//			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {

			if (wr != null) {
				try {
					wr.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}

			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}

		}

		return false;
	}

}
