<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>文章详情</title>
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
	<!-- BEGIN GLOBAL MANDATORY STYLES -->
	<link href="/Express/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="/Express/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
	<link href="/Express/media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="/Express/media/css/style-metro.css" rel="stylesheet" type="text/css"/>
	<link href="/Express/media/css/style.css" rel="stylesheet" type="text/css"/>
	<link href="/Express/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>
	<link href="/Express/media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>
	<link href="/Express/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>
	<!-- END GLOBAL MANDATORY STYLES -->
	<!-- BEGIN PAGE LEVEL STYLES -->
	<link rel="stylesheet" type="text/css" href="/Express/media/css/bootstrap-fileupload.css" />
	<link href="/Express/media/css/bootstrap-modal.css" rel="stylesheet" type="text/css"/>
	<!-- END PAGE LEVEL STYLES -->
	<link rel="shortcut icon" href="/Express/media/image/favicon.ico" />	
	
</head>
<body class="page-header-fixed">
	<!-- BEGIN HEADER -->
	<%@ include file="/pages/includes/top_banner.jsp"%>
	<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container row-fluid">
	<%@ include file="/pages/includes/left_navigation.jsp"%>
		<!-- BEGIN PAGE -->  
		<div class="page-content">
			<!-- BEGIN SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<div id="portlet-config" class="modal hide">
				<div class="modal-header">
					<button data-dismiss="modal" class="close" type="button"></button>
					<h3>portlet Settings</h3>
				</div>
				<div class="modal-body">
					<p>Here will be a configuration form</p>
				</div>
			</div>
			<!-- END SAMPLE PORTLET CONFIGURATION MODAL FORM-->
			<!-- BEGIN PAGE CONTAINER-->
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<h3 class="page-title">
							文章详情
						</h3>
						<ul class="breadcrumb">
							<li>
								<i class="icon-home"></i>
								<a href="index.html">主页</a> 
								<span class="icon-angle-right"></span>
							</li>
							<li>
								<a href="#">文章详情</a>
								<span class="icon-angle-right"></span>
							</li>
						</ul>
					</div>
				</div>
				<div class="row-fluid">
					<div class="span12">
						<!-- BEGIN SAMPLE FORM PORTLET-->   
						<div class="portlet box blue">
							<div class="portlet-title">
								<div class="caption"><i class="icon-reorder"></i>Sample Form</div>
							</div>
						<div class="portlet-body form">
							<!-- BEGIN FORM-->
							<form id="newsForm" action="/Express/news/save.do" class="form-horizontal" method="post" enctype="multipart/form-data" target="hidden_frame">
								<div class="alert alert-error hide">
									<button class="close" data-dismiss="alert"></button>
									表单有错误，请检查！
								</div>
								<div class="alert alert-success hide">
									<button class="close" data-dismiss="alert"></button>
									表单验证成功！
								</div>
								<div class="control-group">
									<label class="control-label">标题</label>
									<div class="controls">
										<input type="text" class="span6 m-wrap" name="adname" />
										<span class="help-inline">必填</span>
									</div>
								</div>
								<div class="control-group">
									<label class="control-label">内容</label>
									<div class="controls">
										<script id="editor" type="text/plain" style="width:800px;height:500px;"></script>
									</div>
								</div>								
								<div class="control-group">
									<label class="control-label">文章类别</label>
									<div class="controls">
										<select class="span6 chosen" data-placeholder="选择类别" tabindex="1" name="position">
											<option value="1">关于协会</option>
											<option value="2">政策法规</option>
											<option value="3">行业公告</option>
											<option value="4">会员风采</option>
										</select>
									</div>
								</div>
								<div class="form-actions">
									<button type="submit" class="btn blue">提交</button>
									<button type="reset" class="btn">取消</button>                            
								</div>
							</form>
						</div>
						</div>
						<!-- END EXTRAS PORTLET-->
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- END CONTAINER -->
	<!-- BEGIN FOOTER -->
	<div class="footer">
		<div class="footer-inner">
			2013 &copy; Metronic by keenthemes.
		</div>
		<div class="footer-tools">
			<span class="go-top">
			<i class="icon-angle-up"></i>
			</span>
		</div>
	</div>
	<iframe name='hidden_frame' id="hidden_frame" style="display:none" ></iframe>  
	<!-- END FOOTER -->
	<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS -->
	<script src="/Express/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
	<script src="/Express/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script src="/Express/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
	<script src="/Express/media/js/bootstrap.min.js" type="text/javascript"></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script type="text/javascript" src="/Express/media/js/bootstrap-fileupload.js"></script>
	<script type="text/javascript" src="/Express/media/js/jsonRespUtils.js"></script>
	<script type="text/javascript" src="/Express/media/js/jquery.validate.min.js"></script>
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="/Express/media/js/app.js"></script>
	<script src="/Express/media/js/form-validation.js"></script> 
	<script type="text/javascript" charset="utf-8" src="/Express/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="/Express/ueditor/ueditor.all.min.js"> </script>
    <script type="text/javascript" charset="utf-8" src="/Express/ueditor/lang/zh-cn/zh-cn.js"></script>
	
	<!-- END PAGE LEVEL SCRIPTS -->
	<script>
		jQuery(document).ready(function() {       
		   // initiate layout and plugins
		   App.init();
		   var rule={adname:{required:true},position:{required:true}};
		   FormValidation.init($('#newsForm'),rule,creatSubmitForm('newsForm'),failedForm);
		   var ue = UE.getEditor('editor');
		});
		
		function failedForm(){
			console.log("failedForm");
		}
		
		function creatSubmitForm(formId){
			return function submitForm(){
				var formObj = $("#"+formId);
			    var formURL = formObj.attr("action");
			    var formData = new FormData(formObj[0]);
			    $.ajax({
			        url: formURL,
			    type: 'POST',
			        data:  formData,
			    mimeType:"multipart/form-data",
			    contentType: false,
			    cache: false,
			    processData:false,
			    success: function(transport)
			    {
			    	 var jresp = new JsonRespUtils(transport);
			    	 if (jresp.isSuccessfully()){
			    		 var res = jresp.getMessage();
			    		 alert("保存成功！");
			    	 }
			    	 location.reload();
			    },
			     error: function(transport) 
			     {
			    	alert("保存失败！");
			     }          
			    });
			}
		}

	</script>
	<script type="text/javascript">  var _gaq = _gaq || [];  _gaq.push(['_setAccount', 'UA-37564768-1']);  _gaq.push(['_setDomainName', 'keenthemes.com']);  _gaq.push(['_setAllowLinker', true]);  _gaq.push(['_trackPageview']);  (function() {    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;    ga.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + 'stats.g.doubleclick.net/dc.js';    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);  })();</script></body>
	<!-- END BODY -->
</body>
</html>