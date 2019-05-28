<?php
	$soapClient = new SoapClient("http://localhost:8080/BankWS/BankWS?WSDL");
	$nomeCli= $_POST['nomeCliente'];
	$senhaCli= $_POST['senhaCliente'];
	$paramSaldo = array('nome' => $nomeCli,'senha' => $senhaCli);
	$result = $soapClient->saldoUser($paramSaldo);
	#print_r($result);
	echo "Cliente: ".$nomeCli;
	echo "<br>Saldo: R$".$result->return;
?>