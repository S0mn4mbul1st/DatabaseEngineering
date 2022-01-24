<!DOCTYPE html>
<html lang="en">
   <head>
   	  <meta charset="ISO-8859-1">
      <!-- Required meta tags -->
      <!-- Required meta tags -->
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <!-- Bootstrap CSS -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
      <!--Font awesome icons -->
      <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
      <link rel="stylesheet" type="text/css" href="/static/css/style.css">
      <title>  </title>
   </head>
   <body style="
      background-position: center center;
      background-repeat: no-repeat;
      background-attachment: fixed;
      background-size: cover;
      background-color: honeydew;
      ">
      <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
         <a class="navbar-brand mt-2 mt-lg-0" href="/">
         <img
            src = "/static/images/up_bar.jpg"
            height="35"
            alt=""
            loading="lazy"
            />
         </a>
         <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
         <span class="navbar-toggler-icon"></span>
         </button>
         <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav ml-auto" >
               <p id="hello-msg" class="nav-item nav-link">Hello, user01 &nbsp;&nbsp;&nbsp;</p>
            </div>
            <div class="navbar-nav ml-auto">
               <a href="/profile/" class="nav-item nav-link"><i class="far fa-address-card"></i>&nbsp;&nbsp;Profile &emsp;</a>
               <a href="/logout/" class="nav-item nav-link"> <i class="fas fa-sign-out-alt"></i>&nbsp;&nbsp;Logout</a>
            </div>
         </div>
      </nav>
      <br><br>
      <div class="container">
         <style>
            .my-custom-scrollbar {
            position: relative;
            height: 300px;
            overflow: auto;
            }
            .table-wrapper-scroll-y {
            display: block;
            }
         </style>
         <div class="text-center " style="
            background-position: center center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            background-color: honeydew;">
            <section>
               <div class="col">
                  <h2 class="text-center" style="color:#232588">Lights</h2>
                  <div class="row">
                     <div class="col">
                        <div class="table-wrapper-scroll-y my-custom-scrollbar">
                           <table class="table table-hover table-striped mb-1 table-bordered" style="background-color: rgba(255, 255, 255, 0.8); text-align: center">
                              <thead>
                                 <tr>
                                    <th scope="col">#</th>
                                    <th scope="col">Place
                                    </th>
                                    <th scope="col">Light, ON/OFF</th>
                                 </tr>
                              </thead>
                              <tbody>
                                 <tr>
                                    <th scope="row">1</th>
                                    <td>Living room</td>
                                    <td>
                                       <div class="form-check form-switch d-flex justify-content-center">
                                          <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" />
                                       </div>
                                    </td>
                                 </tr>
                                 <tr>
                                    <th scope="row">2</th>
                                    <td>Bedroom</td>
                                    <td>
                                       <div class="form-check form-switch d-flex justify-content-center">
                                          <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" />
                                       </div>
                                    </td>
                                 </tr>
                                 <tr>
                                    <th scope="row">3</th>
                                    <td>Cabinet</td>
                                    <td>
                                       <div class="form-check form-switch d-flex justify-content-center">
                                          <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" />
                                       </div>
                                    </td>
                                 </tr>
                                 <tr>
                                    <th scope="row">4</th>
                                    <td>Kitchen</td>
                                    <td>
                                       <div class="form-check form-switch d-flex justify-content-center">
                                          <input class="form-check-input" type="checkbox" role="switch" id="flexSwitchCheckDefault" />
                                       </div>
                                    </td>
                                 </tr>
                                 <tr class="blank_row">
                                    <td colspan="3"></td>
                                 </tr>
                                 <tr></tr>
                              </tbody>
                           </table>
                        </div>
                     </div>
                     <div class="col">
                        <table class="table table-hover table-bordered" style="background-color: rgba(255, 255, 255, 0.8); text-align: center">
                           <thead>
                              <tr style="horiz-align: center">
                                 <th scope="col">
                                    <button type="button" style="background-color:#ff6600" class="btn btn-danger">All ON</button>
                                 </th>
                                 <th scope="col">
                                    <button type="button"  class="btn btn-secondary">All OFF</button>
                                 </th>
                              </tr>
                        </table>
                     </div>
                  </div>
               </div>
            </section>
         </div>
      </div>
      <br/>
      <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-bottom py-6 ">
         <div class="container-fluid">
            <ul class="navbar-nav mx-auto text-center nav-justified">
               <li class="nav-item">
                  <a class="nav-link" href="/"><i class="fas fa-home"></i>Dashboard</a>
               </li>
               <li class="nav-item">
                  <a class="nav-link" href="/climate/"><i class="fas fa-percent"></i><br>Humidity</a>
               </li>
               <li class="nav-item" >
                  <a class="nav-link" href="/lights/"><i class="fas fa-lightbulb"></i><br>Lights</a>
               </li>
               <li class="nav-item">
                  <a class="nav-link" href="/logs/"><i class="fas fa-key"></i><br>Logs</a>
               </li>
               <li class="nav-item ">
                  <a class="nav-link" href="/settings/"><i class="fas fa-cog"></i><br>Settings</a>
               </li>
            </ul>
         </div>
      </nav>
      <!-- Optional JavaScript -->
      <!-- jQuery first, then Popper.js, then Bootstrap JS -->
      <!-- jQuery first, then Popper.js, then Bootstrap JS -->
      <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
      <!-- A plugin for password show/hide  -->
      <script src="https://unpkg.com/bootstrap-show-password@1.2.1/dist/bootstrap-show-password.min.js"></script>
   </body>
</html>
<br/>
<br/><br/><br/>