<?php
use PHPMailer\PHPMailer\PHPMailer;
use PHPMailer\PHPMailer\Exception;

require 'Exception.php';
require 'PHPMailer.php';
require 'SMTP.php';
//require_once('PHPMailer.php'); //chama a classe de onde você a colocou.

$mail = new PHPMailer(); // instancia a classe PHPMailer

$mail->IsSMTP();

$nome = $_POST['name'];
$email = $_POST['email'];
$mensagem = $_POST['message'];

//configuração do gmail
$mail->Port = '465'; //porta usada pelo gmail.
$mail->Host = 'smtp.gmail.com'; 
$mail->IsHTML(true); 
$mail->Mailer = 'smtp'; 
$mail->SMTPSecure = 'ssl';

//configuração do usuário do gmail
$mail->SMTPAuth = true; 
$mail->Username = 'emissor.ru.digital@gmail.com'; // usuario gmail.   
$mail->Password = 'RuDigital123'; // senha do email.

$mail->SingleTo = true; 

// configuração do email a ver enviado.
$mail->setFrom($email, $nome);

$mail->addAddress("servidor.ru.digital@gmail.com"); // email do destinatario.

$mail->Subject = "Contato Site - $email";
$mail->Body = $mensagem;

if(!$mail->Send())
  header("location:400.html");
else
  header("location:obrigado.html");
?>