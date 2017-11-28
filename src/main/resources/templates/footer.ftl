<@layout.extends name="based.ftl">
    <@layout.put block="header" type="replace">
    </@layout.put>
    <@layout.put block="contents">
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
                        <li><a href="#">Curses</a></li>
                        <li><a href="#">Trainings</a></li>
                        <li><a href="#">Trainers</a></li>
                        <li><a href="#">Faq</a></li>
                        <li><a href="#">Contac Us</a></li>
                        <li><a href="#">Login Us</a></li>
                    </ul>
                </div>
                <div class="column">
                    <p class="title is-5">About us:</p>
                    <p class="subtitle">This column is only 200px wide.</p>
                </div>
            </div>
        </div>
    </footer>
    </@layout.put>
</@layout.extends>
