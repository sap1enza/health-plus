<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Olá Mundo!</title>
</head>
<body>


<center><h1 class="align-middle" style="color: #0062cc">Health+</h1></center>


<!------ Após adicionar Bootstrap remover o hard-coded ---------->
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<style>

.login-container{
    margin-top: 5%;
    margin-bottom: 5%;
}
.login-form-1{
    padding: 5%;
    box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);
}
.login-form-1 h3{
    text-align: center;
    color: #333;
}
.login-form-2{
    padding: 5%;
    background: #0062cc;
    box-shadow: 0 5px 8px 0 rgba(0, 0, 0, 0.2), 0 9px 26px 0 rgba(0, 0, 0, 0.19);
}
.login-form-2 h3{
    text-align: center;
    color: #fff;
}
.login-container form{
    padding: 10%;
}
.btnSubmit
{
    width: 50%;
    border-radius: 1rem;
    padding: 1.5%;
    border: none;
    cursor: pointer;
}
.login-form-1 .btnSubmit{
    font-weight: 600;
    color: #fff;
    background-color: #0062cc;
}
.login-form-2 .btnSubmit{
    font-weight: 600;
    color: #0062cc;
    background-color: #fff;
}
.login-form-2 .SignUp{
    color: #fff;
    font-weight: 600;
    text-decoration: none;
}
.login-form-1 .SignUp{
    color: #0062cc;
    font-weight: 600;
    text-decoration: none;
}

</style>
<!------ Após adicionar Bootstrap remover o hard-coded ---------->

<div class="container login-container">
    <div class="row">
        <div class="col-md-6 login-form-1">
            <h3>Paciente</h3>
            <form>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="E-mail *" value="" />
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Senha *" value="" />
                </div>
                <div class="form-group">
					<input type="submit" class="btnSubmit" value="Login" />
                </div>
                <div class="form-group">
					<a href="/health.plus/paciente/cadastro" class="SignUp">Cadastrar-se</a>
				</div>
            </form>
        </div>
        <div class="col-md-6 login-form-2">
            <h3>Empresa</h3>
            <center><b style="color: white">Em breve!</b></center>
            <form style="display: none">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="E-mail *" value="" />
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Senha *" value="" />
                </div>
                <div class="form-group">
                    <input type="submit" class="btnSubmit" value="Login" />
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>