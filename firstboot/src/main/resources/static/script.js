$(document).ready(
		
		function () {
		//	alert("JQUERY IS WORKING")
			$('#city').keyup(
				function(){
					
					let pattern=$('#city').val();
					$.get("http://localhost:8080/api/cities/"+ pattern,function(cities){
						let code="";
						for(let x in cities){
							code+="<tr>";
							code+="<td>"+cities[x].name+"</td>";
							code+="<td>"+cities[x].district+"</td>";
							code+="<td>"+cities[x].population+"</td>";
							code+="</tr>";
														
						}
						$('#tdata').html(code);
						
					});
					
				}	
			);
			
			$('#country').change(
					function(){
						
						let pattern=$('#country').val();
						$.get("http://localhost:8080/api/allcities/"+ pattern,function(cities){
							let code="";
							for(let x in cities){
								code+="<tr>";
								code+="<td>"+cities[x].name+"</td>";
								code+="<td>"+cities[x].district+"</td>";
								code+="<td>"+cities[x].population+"</td>";
								code+="</tr>";
															
							}
							$('#tdata').html(code);
							
						});
						
					}	
				);
		}
);