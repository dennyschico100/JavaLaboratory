
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        
        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script type="text/javascript" src="js/materialize.min.js"></script>


        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.css">
        <link rel="stylesheet" type="text/css" href="css/templatemo-art-factory.css">
        <link rel="stylesheet" type="text/css" href="css/owl-carousel.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" rel="stylesheet">


    </head>

    <body>
        <style>
       body{
          background:linear-gradient(120deg,#8360c3,#2ebf91);

        }
         p{
            color: white;
        }
        h5{
            color white;
        }

        
    </style>
<style>
    section{
        padding: 10px;
        padding-left: 15px;
    }

.izq{
    animation: izq 1s ease-in-out;
}

@keyframes izq{

    0%{
        transform: translateX(-200px) rotate(0deg);
        opacity: 0;

    }
    60{
        transform: translateX(10px);

        

    }
    100%{
        transform: translateX(0px);
        opacity: 1;

    }


}



</style>
        <style>
            .body2{
                width: 98%;
                height: 440px;
                transform: translateX(13px);
            }
            h1{
                color:white;

            }


        </style>

        <jsp:include page="../nav3.html" />




        <div class= container">
            <div class="row">
                <div class="col-md-12">
                    <img class="body2" src="1.jpg" >
                </div>

            </div>
        </div>
        <div class="container my-5">
            <div class="row">
                <style>
                    .mySlides {display:none;}
                </style>
                <div class="col-md-6 offset-md-3">
                    <div class="w3-content w3-display-container">
                        <img class="mySlides" src="3.jpg" style="width:100%">

                        <img class="mySlides" src="4.jpg" style="width:100%">

                        <img class="mySlides" src="2.PNG" style="width:100%">


                        <button class="w3-button w3-black w3-display-left" onclick="plusDivs(-1)">&#10094;</button>
                        <button class="w3-button w3-black w3-display-right" onclick="plusDivs(1)">&#10095;</button>
                    </div>

                </div>      
            </div>

        </div>
        <section class="section" id="about">
            <div class="container">
                <div class="row">
                    <div class="col-lg-7 col-md-12 col-sm-12" data-scroll-reveal="enter left move 30px over 0.6s after 0.4s">
                        <img src="aula.jpg"  class="izq rounded img-fluid d-block mx-auto" alt="App">
                    </div>
                    <div class="right-text col-lg-5 col-md-12 col-sm-12 mobile-top-fix">
                        <div class="left-heading">
                            <h5>Nuestra Mision</h5>
                        </div>
                        <div class="left-text">
                            <p>
                                Somos un centro educativo que forma para la vida, promoviendo un proceso de educación permanente, integral y sistemática en cada uno de sus miembros para contribuir desde nuestro ser y hacer a la transformación de nuestro entorno.
                            </p>

                        </div>

                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="hr"></div>
                    </div>
                </div>
            </div>
        </section>

        <section class="section" id="about">
            <div class="container">
                <div class="row">
                    <div class="right-text col-lg-5 col-md-12 col-sm-12 mobile-top-fix">
                        <div class="left-heading">
                            <h5>Nuestra Vision</h5>
                        </div>
                        <div class="left-text">
                            <p>

                                Ser una institución que oriente una pastoral educativa, inspirada en los valores evangélicos y la filosofía asuncionista que impulsemos un proceso de educación integral donde sus miembros desarrollen el respeto a la individualidad del ser humano forme para lo social, en libertad y transforme la sociedad.



                            </p>


                        </div>

                    </div>

                    <div class="col-lg-7 col-md-12 col-sm-12" data-scroll-reveal="enter left move 30px over 0.6s after 0.4s">
                        <img src="niños.jpg" class="izq rounded img-fluid d-block mx-auto" alt="App">
                    </div>

                </div>

                <div class="row">
                    <div class="col-lg-12">
                        <div class="hr"></div>
                    </div>
                </div>
            </div>
        </section>    



    </body>
    <script>
        var slideIndex = 1;
        showDivs(slideIndex);

        function plusDivs(n) {
            showDivs(slideIndex += n);
        }

        function showDivs(n) {
            var i;
            var x = document.getElementsByClassName("mySlides");
            if (n > x.length) {
                slideIndex = 1
            }
            if (n < 1) {
                slideIndex = x.length
            }
            for (i = 0; i < x.length; i++) {
                x[i].style.display = "none";
            }
            x[slideIndex - 1].style.display = "block";
        }
    </script>
    <script src="js/jquery-2.1.0.min.js"></script>

    <!-- Bootstrap -->
    <script src=js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugins -->
    <script src="js/owl-carousel.js"></script>
    <script src="js/scrollreveal.min.js"></script>
    <script src="js/waypoints.min.js"></script>
    <script src="js/jquery.counterup.min.js"></script>
    <script src="js/imgfix.min.js"></script> 

    <!-- Global Init -->
    <script src="js/custom.js"></script>



</html>
