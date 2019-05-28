<?php
	$soapClient = new SoapClient("http://localhost:8080/BankWS/BankWS?WSDL");
	$nomeCli= $_POST['nomeNew'];
	$senhaCli= $_POST['senhaNew'];
	$saldoCli= $_POST['saldoNew'];
	$paramCad = array('nome' => $nomeCli,'senha' => $senhaCli, 'saldo' => $saldoCli);
	$result = $soapClient->cadastrarUser($paramCad);
	#print_r($result);
	echo "Seja Bem Vindo : ".$nomeCli;
	echo "<br>Seu saldo é de R$".$saldoCli;
?>