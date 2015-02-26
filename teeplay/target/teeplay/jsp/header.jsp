<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<script type="text/javascript">
	$(document).ready(function(){
		var n = $("#liindex").val();
		for(var i=1;i<=5;i++){
			if(n == i){
				$("#li"+i).attr("class","active");
			}else{
				$("#li"+i).attr("class","");
			}
		}
	});
</script>
<div class="header">
	<div class="header_top">
		<div class="wrap">
			<div class="logo">
				<a href="/"><img src="/images/logo.png"
					alt="" /></a>
			</div>
			<div class="menu">
				<ul>
					<li id="li1" ><a href="/">&nbsp;&nbsp;主页&nbsp;&nbsp;</a></li>
					<li id="li2" ><a href="/about">关于我们</a></li>
					<li id="li3" ><a href="/services">&nbsp;&nbsp;服务&nbsp;&nbsp;</a></li>
					<li id="li4" ><a href="/marketing">&nbsp;&nbsp;产品&nbsp;&nbsp;</a></li>
					<li id="li5" ><a href="/contact">联系我们</a></li>
					<div class="clear"></div>
				</ul>
			</div>
			<div class="clear"></div>
		</div>
	</div>
</div>