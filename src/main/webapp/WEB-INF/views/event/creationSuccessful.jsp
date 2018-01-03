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
                <a class="navbar-item" href="../">
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
                            <div class="dropdown">
                                    <div class="dropdown-trigger">
                                      <button class="button" aria-haspopup="true" aria-controls="dropdown-menu">
                                        <span>${member.firstName}.${member.lastName}</span>
                                        <span class="icon is-small">
                                          <i class="fa fa-user" aria-hidden="true"></i>
                                        </span>
                                      </button>
                                    </div>
                                    <div class="dropdown-menu" id="dropdown-menu" role="fmenu">
                                      <div class="dropdown-content">
                                        <a href="${pageContext.request.contextPath}/team/register" class="dropdown-item">
                                          Create team
                                        </a>
                                        <a href="${pageContext.request.contextPath}/team/list/admin" class="dropdown-item">
                                          My teams
                                        </a>
                                        <a href="${pageContext.request.contextPath}/team/list" class="dropdown-item">
                                          All teams
                                        </a>
                                        <hr class="dropdown-divider">
                                        <a href="${pageContext.request.contextPath}/member/update" class="dropdown-item">
                                            Edit profile
                                        </a>
                                        <a href="${pageContext.request.contextPath}/member/logout" class="dropdown-item">
                                          Log out
                                        </a>
                                      </div>
                                    </div>
                                  </div>

                    </p>
                </div>
                
            </div>
        </div>
    </nav>    
      <section class="hero">
         <div class="hero-body">
            <div class="container has-text-centered">
               <div class="column is-4 is-offset-4">
                  <h3 class="title">Event Created</h3>
                  <p class="subtitle has-text-grey">Your event was created successfuly!</p>                
                    <b>Name of event:</b> <p>${event.name}</p>
                    <b>Description:</b> <p>${event.description}</p>
               </div>
            </div>
         </div>
      </section>            
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
                        <li><a href="${pageContext.request.contextPath }/home/about">Contac Us</a></li>
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
