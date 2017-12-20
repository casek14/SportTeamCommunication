<!DOCTYPE html>
<html>
    <head>
        <title>Sports Tracker - Enjoy your movement</title>
        
        <@layout.block name="head">
        	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.6.0/css/bulma.min.css">
        	<link href="<c:url value="resources/static/css/style.css" />" rel="stylesheet" type="text/css" />
            <link rel="stylesheet" type="text/css" href='resources/static/css/style.css'/>
        	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

        </@layout.block>
    </head>
    <body>
        <@layout.block name="header">
        <nav class="navbar">
        <div class="container">
            <div class="navbar-brand">
                <a class="navbar-item" href="/">
                    <h1 class="title"> Sporitfy</h1>
                    <br />
                    <h4 class="subtitle">  Stay connected</h4>
                </a>
                <span class="navbar-burger burger" data-target="navbarMenu">
                    <span></span>
                    <span></span>
                    <span></span>
                </span>
            </div>
       		 <@layout.block name="navMenu">
            	            <div id="navbarMenu" class="navbar-menu">
                <div class="navbar-end">
                    <a href="/curses" class="navbar-item is-active">
                        Curses
                      </a>
                    <a href="/trainings" class="navbar-item">
                        Trainings
                      </a>
                    <a href="/trainers" class="navbar-item">
                        Trainers
                      </a>
                    <a href="/faq" class="navbar-item">
                        Faq
                      </a>
                    <a href="/about" class="navbar-item">
                        About
                      </a>
                </div>
                <div class="navbar-item">
                    <p class="control">
                        <a class="button" href="login.html">
                            <span class="icon">
                               <i class="fa fa-user"></i>
                               </span>
                            <span>Login</span>
                        </a>
                    </p>
                </div>
            </div>
        	 </@layout.block>
        	       </div>
    		</nav>            
        </@layout.block>
       
       
       
       
        <div class="base">
            <@layout.block name="contents">
            </@layout.block>
        </div>
        <@layout.block name="footer">
        
        
        
        
        
        
        
        
        
        
        
        
        <footer class="footer">
        <div class="container">
            <div class="columns">
                <div class="column">
                    <p class="title is-5">Follow us: </p>
                    <p class="subtitle">This column is only 200px wide.</p>
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
                        <p class="title is-5">Sporitfy</p>
                        <p class="subtitle">666 House, Street 123, State +123 345 678 910</p>
                </div>
                <div class="column">
                    <p class="title is-5 menu-label">Menu: </p>
                    <ul class="menu-list">
                        <li><a href="/curses">Curses</a></li>
                        <li><a href="/trainigs">Trainings</a></li>
                        <li><a href="/trainers">Trainers</a></li>
                        <li><a href="/faq">Faq</a></li>
                        <li><a href="/about">About</a></li>
                        <li><a href="/login">Login Us</a></li>
                    </ul>
                </div>
                <div class="column">
                    <p class="title is-5">About us:</p>
                    <p class="subtitle">This column is only 200px wide.</p>
                </div>
            </div>
        </div>
    </footer>
        
        
        
        </@layout.block>
    </body>
</html>