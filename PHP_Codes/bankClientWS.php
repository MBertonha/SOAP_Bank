<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<title>PeopleBank</title>
</head>
<body>

<h2>Saldo Usuário</h2>
<form action="processSaldo.php" method="post">
	<label for="nomeClienteT">Nome: </label><br>
	<input id="nomeCliente" name="nomeCliente" type="text" required=""><br>
	<label for="senhaClienteT">Senha: </label><br>
	<input id="senhaCliente" name="senhaCliente" type="text" required=""><br>
	<br>
	<input type="submit">
</form>

<h2>Depósito</h2>
<form action="process.php" method="post">
	<label for="valorDepositoT">Valor do Deposito: </label><br>
	<input id="valorDeposito" name="valorDeposito" type="text" required=""><br>
	<label for="nomeDestinatarioT">Nome Destinatario: </label><br>
	<input id="nomeDestinatario" name="nomeDestinatario" type="text" required=""><br>
	<br>
	<input type="submit">
</form>

<h2>Saque</h2>
<form action="processSaque.php" method="post">
	<label for="valorSaqueT">Valor do Saque: </label><br>
	<input id="valorSaque" name="valorSaque" type="text" required=""><br>
	<label for="nomeContaT">Nome Conta: </label><br>
	<input id="nomeConta" name="nomeConta" type="text" required=""><br>
	<br>
	<input type="submit">
</form>

<h2>Cadastrar Novo Usuario</h2>
<form action="processCad.php" method="post">
	<label for="nomeNewT">Nome: </label><br>
	<input id="nomeNew" name="nomeNew" type="text" required=""><br>
	<label for="senhaNewT">Senha: </label><br>
	<input id="senhaNew" name="senhaNew" type="text" required=""><br>
	<label for="saldoNewT">Saldo Inicial: </label><br>
	<input id="saldoNew" name="saldoNew" type="text" required=""><br>
	<br>
	<input type="submit">
</form>

<h2>Alterar Cadastro</h2>
<form action="processAlter.php" method="post">
	<label for="nomeOldT">Nome Antigo: </label><br>
	<input id="nomeOld" name="nomeOld" type="text" required=""><br>
	<label for="newNameT">Nome Novo: </label><br>
	<input id="newName" name="newName" type="text" required=""><br>
	<label for="senhaOldT">Senha Antiga: </label><br>
	<input id="senhaOld" name="senhaOld" type="text" required=""><br>
	<label for="newSenhaT">Senha Antiga: </label><br>
	<input id="newSenha" name="newSenha" type="text" required=""><br>
	<br>
	<input type="submit">
</form>

<h2>Consultar Conta</h2>
<form action="processConsult.php" method="post">
	<label for="nomeCT">Nome: </label><br>
	<input id="nomeC" name="nomeC" type="text" required=""><br>
	<label for="senhaCT">Senha: </label><br>
	<input id="senhaC" name="senhaC" type="text" required=""><br>
	<br>
	<input type="submit">
</form>

</body>
</html>
