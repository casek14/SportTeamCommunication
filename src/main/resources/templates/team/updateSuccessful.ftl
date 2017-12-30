  <@layout.extends name="based.ftl"> 
    <@layout.put block="contents">
      <section class="hero">
         <div class="hero-body">
            <div class="container has-text-centered">
               <div class="column is-4 is-offset-4">
                  <h3 class="title">Done</h3>
                  <p class="subtitle has-text-grey">Your team was successfully updated!</p>               

                    <b>Name:</b> <p> ${team.name }</p>
                    <b>Decription:</b> <p>${team.description }</p>
					<tr><td><a href="${pageContext.request.contextPath }/team/list/admin ">List all teams of the logged user</a></td></tr>

               </div>
            </div>
         </div>
      </section>
   </@layout.put>
</@layout.extends>
