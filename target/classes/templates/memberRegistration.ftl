<@layout.extends name="based.ftl"> 
    <@layout.put block="contents">
        <section class="hero">
         <div class="hero-body">
            <div class="container has-text-centered">
               <div class="column is-4 is-offset-4">
                  <h3 class="title">Sign UP</h3>
                  <p class="subtitle has-text-grey">Please give us your information.</p>
                  <form>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="text" placeholder="First Name" autofocus="">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="text" placeholder="Surname" autofocus="">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="email" placeholder="Your Email" autofocus="">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="text" placeholder="Fav. Sports" autofocus="">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="date" placeholder="Birth Date" autofocus="">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="tel" placeholder="Phone" autofocus="" maxlength="9">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="text" placeholder="Address" autofocus="">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="text" placeholder="City" autofocus="">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="number" placeholder="Zip" maxlength="5">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="password" placeholder="Your Password">
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <input class="input is-large" type="password" placeholder="Password once again">
                        </div>
                     </div>
                     <a class="button is-block is-info is-large">Sing up</a>
                  </form>
               </div>
            </div>
         </div>
      </section>
  
  
  
    </@layout.put>
</@layout.extends>