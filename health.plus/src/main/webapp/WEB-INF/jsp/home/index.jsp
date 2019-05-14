<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>

<tags:template title="Saúde+">
<center><h1 class="align-middle" style="color: #0062cc">Health+</h1></center>

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
</tags:template>
