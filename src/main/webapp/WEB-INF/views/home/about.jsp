<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sportify - Stay Connected</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.0/css/bulma.min.css">
</head>
<body>
    <nav class="navbar">
        <div class="container">
            <div class="navbar-brand">
                <a class="navbar-item" href="#">
                    <h1 class="title"> Sportyfy</h1>
                    <br />
                    <h4 class="subtitle">  Stay connected</h4>
                </a>
                <span class="navbar-burger burger" data-target="navbarMenu">
                      <span></span>
                <span></span>
                <span></span>
                </span>
            </div>
            <div id="navbarMenu" class="navbar-menu">
                <div class="navbar-end">
                    <a href="${pageContext.request.contextPath }/home/curses" class="navbar-item">
                        Curses
                      </a>
                    <a href="${pageContext.request.contextPath }/home/trainers" class="navbar-item">
                        Trainers
                      </a>
                    <a href="${pageContext.request.contextPath }/home/faq" class="navbar-item">
                        Faq
                      </a>
                    <a href="${pageContext.request.contextPath }/home/about" class="navbar-item">
                        Contact us
                      </a>
                </div>
                <div class="navbar-item">
                    <p class="control">
                        <a class="button" href="${pageContext.request.contextPath }/member/login">
                            <span class="icon">
                               <i class="fa fa-user"></i>
                               </span>
                            <span>Login</span>
                        </a>
                    </p>
                </div>
            </div>
        </div>
    </nav>





    <div class="container">
        <p class="title">
            About Us
        </p>
        <div class="columns">
            <div class="column">
                <!-- Embedded Google Map -->
                <iframe width="100%" height="400px" frameborder="0" scrolling="no" marginheight="0" marginwidth="0" src="http://maps.google.com/maps?hl=en&amp;ie=UTF8&amp;ll=37.0625,-95.677068&amp;spn=56.506174,79.013672&amp;t=m&amp;z=4&amp;output=embed"></iframe>

            </div>
            <div class="column">
                <p class="title is-5">Details:</p>
                <p class="subtitle">Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Vestibulum fermentum tortor id mi. Pellentesque ipsum. Mauris tincidunt sem sed arcu. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus. In sem justo, commodo ut, suscipit at, pharetra vitae, orci. Mauris metus. Etiam bibendum elit eget erat. Fusce tellus. Nam sed tellus id magna elementum tincidunt. </p>
</p>
            </div>
        </div>
    </div>

    <div class="container">
        <div class="field">
            <label class="label">Username</label>
            <div class="control has-icons-left has-icons-right">
                <input class="input" type="text" placeholder="Text input" value="Your username">
                <span class="icon is-small is-left">
                    <i class="fa fa-user"></i>
                  </span>
            </div>
        </div>

        <div class="field">
            <label class="label">Email</label>
            <div class="control has-icons-left has-icons-right">
                <input class="input" type="email" placeholder="Email input" value="hello@localhost	">
                <span class="icon is-small is-left">
                    <i class="fa fa-envelope"></i>
                  </span>
                <span class="icon is-small is-right">
                    <i class="fa fa-warning"></i>
                  </span>
            </div>
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


        <div class="field is-grouped have-botgap">
            <div class="control">
                <button class="button is-link">Submit</button>
            </div>
            <div class="control">
                <button class="button is-text">Cancel</button>
            </div>
        </div>
    </div>
    <footer class="footer">
        <div class="container">
            <div class="columns">
                <div class="column">
                    <p class="title is-5">Follow us: </p>
                    <p class="subtitle">You can follow us on ours social medias.</p>
                    <a href="#" target="_blank">
                        <span class="icon" style="color: #333;">
                  <i class="fa fa-lg fa-facebook"></i>
                  </span>
                        <a href="#" target="_blank">
                            <span class="icon" style="color: #333;">
                  <i class="fa fa-lg fa-twitter"></i>
                  </span>
                        </a>
                        <a href="#" target="_blank">
                            <span class="icon" style="color: #333;">
                  <i class="fa fa-lg fa-google"></i>
                  </span>
                        </a>
                        <a href="#" target="_blank">
                            <span class="icon" style="color: #333;">
                  <i class="fa fa-lg fa-youtube"></i>
                  </span>
                        </a>
                        <p class="title is-5">Sportyfy</p>
                        <p class="subtitle">666 House, <br /> Street 123, <br /> State +123 345 678 910</p>
                </div>
                <div class="column">
                    <p class="title is-5 menu-label">Menu: </p>
                    <ul class="menu-list">
                        <li><a href="${pageContext.request.contextPath }/home/curses">Curses</a></li>
                        <li><a href="${pageContext.request.contextPath }/home/trainers">Trainers</a></li>
                        <li><a href="${pageContext.request.contextPath }/home/faq">Faq</a></li>
                        <li><a href="${pageContext.request.contextPath }/home/about">Contact Us</a></li>
                        <li><a href="${pageContext.request.contextPath }/member/login">Login in</a></li>
                    </ul>
                </div>
                <div class="column">
                    <p class="title is-5">About us:</p>
                    <p class="subtitle">Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Vestibulum fermentum tortor id mi. Pellentesque ipsum. Mauris tincidunt sem sed arcu. Mauris suscipit, ligula sit amet pharetra semper, nibh ante cursus purus, vel sagittis velit mauris vel metus. In sem justo, commodo ut, suscipit at, pharetra vitae, orci. Mauris metus. Etiam bibendum elit eget erat. Fusce tellus. Nam sed tellus id magna elementum tincidunt. </p>
                </div>
            </div>
        </div>
    </footer>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bulma.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/custom.js"></script>
    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>
</body>
</html>
