<?php
	$soapClient = new SoapClient("http://localhost:8080/BankWS/BankWS?WSDL");
	$oldNomeCli= $_POST['nomeOld'];
	$oldSenhaCli= $_POST['senhaOld'];
	$newNomeCli= $_POST['newName'];
	$newSenhaCli= $_POST['newSenha'];
	$paramCad = array('oldNome' => $oldNomeCli,'newNome' => $newNomeCli, 'oldSenha' => $oldSenhaCli, 'newSenha' => $newSenhaCli);
	$result = $soapClient->alterCadastro($paramCad);
	#print_r($result);
	echo "Cadastro Alterado com Sucesso...<br><br>";
	echo "Novo nome : ".$newNomeCli;
	echo "<br>Nova Senha: ".$newSenhaCli;
?>