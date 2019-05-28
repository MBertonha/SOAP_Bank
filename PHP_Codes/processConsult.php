<?php
	$soapClient = new SoapClient("http://localhost:8080/BankWS/BankWS?WSDL");
	$nomeCli= $_POST['nomeC'];
	$senhaCli= $_POST['senhaC'];
	$paramSaldo = array('nome' => $nomeCli,'senha' => $senhaCli);
	$result = $soapClient->consultUser($paramSaldo);
	#print_r($result);
	#echo "Cliente: ".$nomeCli;
	echo $result->return;
?>