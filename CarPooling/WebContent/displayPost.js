
$(
		function display(){
			$.ajax({
                type:'GET',
		        url : "DisplayPost",
		        headers:{
		        	Accept:"application/json; charset=utf-8","Content-Type":"application/json;charset=utf-8"
		        },
		        error : function() {

		            alert("Error found");
		        },
		        success : function(data) {
		        	var postInfo=$.parseJSON(data)
		        	for(let i=0;i<postInfo.length;i++){
		        		
			            $("#userPosts").append("<p>"+postInfo[i].post+"</p>");
			            $("#userPosts").append("<button class=\"comment\"  post-id=" + postInfo[i].postId + " user-id="+postInfo[i].userId+" posttype="+postInfo[i].postType+">Comments</button>");
			            $("#userPosts").append("<input id=\"comment"+postInfo[i].postId+"\"style=\"border:none;background-color:white\" disabled=\"disabled\" value=\"0\" name=\"like\" postId="+postInfo[i].postId+">");
			            $("#userPosts").append("<button class=\"like\" post-id=" + postInfo[i].postId + " user-id="+postInfo[i].userId+" posttype="+postInfo[i].postType+">Like</button>");
			            $("#userPosts").append("<input id=\"like"+postInfo[i].postId+"\" style=\"border:none;background-color:white\" disabled=\"disabled\" value=\"0\" name=\"like\" postId="+postInfo[i].postId+">");
			            $("#userPosts").append("<div class='cmntb' id="+"div"+postInfo[i].postId +"><ul> </ul></div>");
			            $("#userPosts").append('<hr/>')
			        	
		        		
		        	}
		        	

		        }
		});
			
			
			
			 $(".like").css({ "background-image": "url('like.png')" });
			    
			    $(document).delegate(".comment", "click", displayComent);
			   //$(document).delegate(".send", "click", postcomment);
			    
			    
			    function displayComent(){

			         var pid = $(this).attr("post-id");
			         var divId="div"+pid;
			                        $("#"+divId).append("<input type=\"text\" name=\"post\"/><br/>");
			                        $("#"+divId).append("<input div-id=" + divId+ "class=\"send\" type=\"button\" value=\"Post\" name=\"submit\"/><br/>");
			                    }
			    
			                
			    
			
			
		}	
		
		
		

);

$(".send").on("click","postcomment");

function postcomment(){
	 var divId = $(this).attr("div-id");
	 $("#"+divId+" > ul" ).append("<li>This is the comment</li>")
}    


