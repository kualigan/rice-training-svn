<#macro bookstore_header element>

<#assign homeLink = "landing">
<#assign oldPortalLink = "/trnapp/portal.do">
    <div class="container">
      <div class="masthead gwd-div-hgmx">
         <h3 class="text-muted">Kuali Training Bookstore</h3>

        <ul class="nav nav-justified">
          <li class="active">
            <a href="#">Home</a>
          </li>
          <li>
            <a href="?active=Store">Store</a>
          </li>
          <li>
            <a href="/trnapp/portal.do?selectedTab=administration">Administration</a>
          </li>
          <li>
            <a href="?active=About">About</a>
          </li>
          <li>
            <a href="?active=Contact">Contact</a>
          </li>
        </ul>
      </div>
      <!-- Jumbotron -->
      <div class="jumbotron">
         <h1>Marketing stuff!</h1>

        <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet.</p>
        <p>
          <a class="btn btn-lg btn-success" href="#" role="button">Get started today</a>
        </p>
      </div>
   </div>
</#macro>
