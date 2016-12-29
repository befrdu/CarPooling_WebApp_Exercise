<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css" />
 <script type="text/javascript">
 $(document).ready(function(){
		$('#signupform').validate({
			rules:{
				firstname:{
					required:true,
					minlength:1,
					maxlength:15
				},
				middlename:{
					required:true,
					minlength:1,
					maxlength:15
				},
				lastname:{
					required:true,
					minlength:1,
					maxlength:20
				},
				state:{
					required:true,
					minlength:2,
					maxlength:15
				},
				city:{
					required:true,
					minlength:2,
					maxlength:15
				},
				street:{
					required:true,
					minlength:2,
					maxlength:15
				},
				zipcode:{
					required:true,
					number:true,
				},
				password:{
					required:true,
					minlength:4,
					maxlength:15
				},
				age:{
					required:true,
					number:true,
					min:18,
					max:60
				},
				email:{
					required:true,
					email:true
				},
				website:{
					url:true
				}
			}
		});
	});
 </script>
</head>
<body>
 <div class="container">    
        <div id="signupbox" style="margin-top: 50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="panel-title">User Registration Form</div>
                            <div style="float:right; font-size: 85%; position: relative; top:-10px"><a id="signinlink" href="#" onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign In</a></div>
                        </div>  
                        <div class="panel-body">
                            <form id="signupform" class="form-horizontal" role="form" action="SignUp" method="post">
                                
                                <div id="signupalert" style="display:none" class="alert alert-danger">
                                    <p>Error:</p>
                                    <span></span>
                                </div>
                                  
                                <div class="form-group">
                                
                                    <label for="firstname" class="col-sm-3 control-label">First Name</label>
                                    <div class="col-md-9">
                                        <input type="text" style='width:200px' class="form-control" name="firstname" placeholder="First Name">
                                    </div>
                                </div>
                                    
                                <div class="form-group">
                                    <label for="middlename" class="col-sm-3 control-label">Middle Name</label>
                                    <div class="col-md-9">
                                        <input type="text" style='width:200px' class="form-control" name="middlename" placeholder="Middle Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="lastname" class="col-sm-3 control-label">Last Name</label>
                                    <div class="col-md-9">
                                        <input type="text" style='width:200px' class="form-control" name="lastname" placeholder="Last Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                <label for="gender" class="col-sm-3 control-label">Gender</label>
                                    <label class="radio-inline">
									  &nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="gender" id="male" value="1"> Male
									</label>
									<label class="radio-inline">
									  <input type="radio" name="gender" id="female" value="0"> Female
									</label>
                                </div>
                                
                                <div class="form-group">
                                    <label for="state" class="col-sm-3 control-label">State</label>
                                    <div class="col-md-9">
                                        <input type="text" style='width:200px' class="form-control" name="state" placeholder="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="city" class="col-sm-3 control-label">City</label>
                                    <div class="col-md-9">
                                        <input type="text" style='width:200px' class="form-control" name="city" placeholder="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="street" class="col-sm-3 control-label">Street</label>
                                    <div class="col-md-9">
                                        <input type="text" style='width:200px' class="form-control" name="street" placeholder="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="zipcode"  class="col-sm-3 control-label">Zip Code</label>
                                    <div class="col-md-9">
                                        <input type="text" style='width:200px' class="form-control" name="zipcode" placeholder="">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="dob" class="col-sm-3 control-label">Birth Year</label>
                                    <div class="col-md-9">
                                        <input type="text" style='width:200px' class="form-control" name="birthyear" placeholder="yyyy">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="email" class="col-sm-3 control-label">Email</label>
                                    <div class="col-md-9">
                                        <input type="email" style='width:200px' class="form-control" name="email" placeholder="sample@gmail.com">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="password" class="col-sm-3 control-label">Password</label>
                                    <div class="col-md-9">
                                        <input type="password" style='width:200px' class="form-control" name="password" placeholder="Password">
                                    </div>
                                </div>
                                    
                                

                                <div class="form-group">
                                    <!-- Button -->                                        
                                    <div class="col-md-offset-3 col-md-9">
                                     <span style="margin-left:8px;"></span>  
                                        <input type="submit" value="Sign_Up" class="btn btn-success">
                                    </div>
                                </div>
                                
                                <div style="border-top: 1px solid #999; padding-top:20px" class="form-group">
                                    
                                    <div class="col-md-offset-3 col-md-9">
                                        <button id="btn-fbsignup" type="button" class="btn btn-default"><i class="icon-facebook"></i></button>
                                    </div>                                           
                                        
                                </div>
                                
                            </form>
                         </div>
                    </div>
                
         </div> 
    </div>
</body>
</html>