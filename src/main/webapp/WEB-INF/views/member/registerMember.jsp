<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
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
      <section class="hero">
         <div class="hero-body">
            <div class="container has-text-centered">
               <div class="column is-4 is-offset-4">
                  <h3 class="title">Sign UP</h3>
                  <p class="subtitle has-text-grey">Please give us your information.</p>
                  <s:form  commandName="memberData" action="${pageContext.request.contextPath}/member/register" method="post">

                   <div class="field">
                        <div class="control">
                           <s:input path="firstName" class="input is-large" type="text" placeholder="First Name" autofocus="" />
                           <s:errors path="firstName" cssStyle="color:red;" />
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <s:input path="lastName" class="input is-large" type="text" placeholder="Last Name" autofocus="" />
                           <s:errors path="lastName" cssStyle="color:red;" />
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <s:input path="email" class="input is-large" type="text" placeholder="Your email" autofocus="" />
                           <s:errors path="email" cssStyle="color:red;" />
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <s:input path="dateOfBirth" class="input is-large" type="text" placeholder="Birth date" autofocus="" />
                           <s:errors path="dateOfBirth" cssStyle="color:red;" />
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <s:input path="phoneNumber" class="input is-large" type="text" placeholder="Phone Number" autofocus="" />
                           <s:errors path="phoneNumber" cssStyle="color:red;" />
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">

                           <s:input path="favouriteSports" class="input is-large" type="text" placeholder="favouriteSports" autofocus="" />
                           <s:errors path="favouriteSports" cssStyle="color:red;" />
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <s:input path="Address.street" class="input is-large" type="text" placeholder="Address street" autofocus="" />
                           <s:errors path="Address.street" cssStyle="color:red;" />
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <s:input path="Address.cp" class="input is-large" type="text" placeholder="Address number" autofocus="" />
                           <s:errors path="Address.cp" cssStyle="color:red;" />
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">
                           <s:input path="Address.city" class="input is-large" type="text" placeholder="Address city" autofocus="" />
                           <s:errors path="Address.city" cssStyle="color:red;" />
                        </div>
                     </div>
                     <div class="field">
                        <div class="control">

                           <s:input path="password" class="input is-large" type="password" placeholder="Password" autofocus="" />
                           <s:errors path="password" cssStyle="color:red;" />
                        </div>
                     </div>
                        <input class="button is-block is-info is-large" type="submit" value="Register"/>
                  </s:form>
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
