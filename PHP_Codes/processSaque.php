<?php
	$soapClient = new SoapClient("http://localhost:8080/BankWS/BankWS?WSDL");
	$valorSaq= $_POST['valorSaque'];
	$nomeCont= $_POST['nomeConta'];
	$paramSaque = array('valor' => $valorSaq,'nome' => $nomeCont);
	$result = $soapClient->saque($paramSaque);
	#print_r($result);
	echo "Saque Feito com Sucesso...";
?>