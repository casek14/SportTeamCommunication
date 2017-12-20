<@layout.extends name="based.ftl"> 
    <@layout.put block="contents">
<section class="hero is-medium is-dark is-bold have-botgap">
        <div class="hero-body">
            <div class="container has-text-centered">
                <h1 class="title">
                  Are you missing fridens on sports?
               </h1>
                <h2 class="subtitle">
                  Don't be haste and register right now!
               </h2>
                <button class="button is-info">Register!</button>
            </div>
        </div>
    </section>

    <div class="container">
        <p class="title">
            Contact Usjjjjjjjjjjjjj
        </p>
        <div class="columns">
            <div class="column">
                <!-- Embedded Google Map -->
                <iframe width="100%" height="400px" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.com/maps?hl=en&amp;ie=UTF8&amp;ll=37.0625,-95.677068&amp;spn=56.506174,79.013672&amp;t=m&amp;z=4&amp;output=embed"></iframe>

            </div>
            <div class="column">
                <p class="title is-5">Contact Details:</p>
                <p class="subtitle">This column is only 200px wide.</p>
            </div>
        </div>
    </div>

    <div class="container">
        <div class="field">
            <label class="label">Name</label>
            <div class="control">
                <input class="input" type="text" placeholder="Text input">
            </div>
        </div>

        <div class="field">
            <label class="label">Username</label>
            <div class="control has-icons-left has-icons-right">
                <input class="input" type="text" placeholder="Text input" value="Lokart">
                <span class="icon is-small is-left">
                    <i class="fa fa-user"></i>
                  </span>
            </div>
            <p class="help is-success">This username is available</p>
        </div>

        <div class="field">
            <label class="label">Email</label>
            <div class="control has-icons-left has-icons-right">
                <input class="input" type="email" placeholder="Email input" value="hello@">
                <span class="icon is-small is-left">
                    <i class="fa fa-envelope"></i>
                  </span>
                <span class="icon is-small is-right">
                    <i class="fa fa-warning"></i>
                  </span>
            </div>
            <p class="help is-danger">This email is invalid</p>
        </div>

        <div class="field">
            <label class="label">Subject</label>
            <div class="control">
                <input class="input" type="text" placeholder="Text input" value="Your Subject">
            </div>
        </div>

        <div class="field">
            <label class="label">Message</label>
            <div class="control">
                <textarea class="textarea" placeholder="Textarea"></textarea>
            </div>
        </div>

        <div class="field">
            <div class="control">
                <label class="checkbox">
                    <input type="checkbox"> I agree to the <a href="#">terms and conditions</a>
                </label>
            </div>
        </div>

        <div class="field">
            <div class="control">
                <label class="radio">
                    <input type="radio" name="question"> Yes
                </label>
                <label class="radio">
                    <input type="radio" name="question"> No
                </label>
            </div>
        </div>

        <div class="field is-grouped have-botgap">
            <div class="control">
                <button class="button is-link">Submit</button>
            </div>
            <div class="control">
                <button class="button is-text">Cancel</button>
            </div>
        </div>
    </div>
    </@layout.put>
</@layout.extends>