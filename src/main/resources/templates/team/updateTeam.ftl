

<@layout.extends name="based.ftl"> 
    <@layout.put block="contents">
        <section class="hero">
         <div class="hero-body">
            <div class="container has-text-centered">
               <div class="column is-4 is-offset-4">
                  <h3 class="title">Register Team</h3>
                  <p class="subtitle has-text-grey">Please give us your information.</p>
                  <form commandName="teamData" action="team/manage/${id}" method="post">
                  
                  
                     <div class="field">
                        <div class="control">
 						   <input id="team_id" name="team_id" path="team_id" type="hidden" value="${id }"/>
                        </div>
                     </div>                  
                  
                  
                     <div class="field">
                        <div class="control">
                           <input path="name" class="input is-large" type="text" placeholder="Team Name" autofocus="" />
                           <errors path="name" class="help is-danger" />                         
                        </div>
                     </div>
                                        
                     <div class="field">
                        <div class="control">
                           <input  path="description" class="input is-large" type="text" placeholder="Description" autofocus="">
                           <errors path="description" class="help is-danger" />                         
                        </div>
                     </div>
                     
                    
                     <button type="submit" class="button is-block is-info is-large">Update</button>
                  <form>
               </div>
            </div>
         </div>
      </section>
    </@layout.put>
</@layout.extends>