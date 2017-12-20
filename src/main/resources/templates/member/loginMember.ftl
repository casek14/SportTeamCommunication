<@layout.extends name="based.ftl"> 
    <@layout.put block="contents">
    <section class="hero">
        <div class="hero-body">
            <div class="container has-text-centered">
                <div class="column is-4 is-offset-4">
                    <h3 class="title">Login</h3>
                    <p class="subtitle has-text-grey">Please login to proceed.</p>
                    <form>
                        <div class="field">
                            <div class="control">
                                <input path="email" class="input is-large" type="email" placeholder="Your Email" autofocus="">
                                <errors path="email" class="help is-danger" />                               
                            </div>
                        </div>

                        <div class="field">
                            <div class="control">
                                <input path="password" path="email" class="input is-large" type="password" placeholder="Your Password">
                                <errors path="password" class="help is-danger" />                         
     
                            </div>
                        </div>
                        <div class="field">
                            <label class="checkbox">
                                <input type="checkbox"> Remember me
                            </label>
                        </div>
                        <a type="submit" class="button is-block is-info is-large">Login</a>
                    </form>
                    <p class="has-text-grey">
                        <a href="register">Sign Up</a> &nbsp;·&nbsp;
                        <a href="passwordMember">Forgot Password</a>
                    </p>
                </div>
            </div>
        </div>
    </section>

    </@layout.put>
</@layout.extends>