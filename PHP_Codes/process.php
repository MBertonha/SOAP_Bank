<?php
	$soapClient = new SoapClient("http://localhost:8080/BankWS/BankWS?WSDL");
	$valorDep= $_POST['valorDeposito'];
	$nomeDest= $_POST['nomeDestinatario'];
	$paramDeposito = array('valor' => $valorDep,'nome' => $nomeDest);
	$result = $soapClient->deposito($paramDeposito);
	#print_r($result);
	echo "Depósito Feito com Sucesso...";
?>
