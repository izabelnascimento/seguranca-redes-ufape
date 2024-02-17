import java.security.*;

import javafx.scene.control.MenuItem;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;

public class ECDSAApplication {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, InvalidKeyException, SignatureException {
        // 1 - Parâmetros de domínio global
        ECNamedCurveParameterSpec ECCparam = ECNamedCurveTable.getParameterSpec("prime192v2");

        // Adiciona o provedor Bouncy Castle
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

        // 2 - Geração de chave: gera um par de chaves pública e privada
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("ECDSA", "BC");

		keyGen.initialize(ECCparam);
		KeyPair keyPair = keyGen.generateKeyPair();

		PublicKey pubKey = keyPair.getPublic();
		PrivateKey prvKey = keyPair.getPrivate();

        // Criação de itens de menu com as chaves pública e privada
		MenuItem jTACPrivada =  new MenuItem();
		jTACPrivada.setText(prvKey.toString());
		MenuItem jTACPublica = new MenuItem();
		jTACPublica.setText(pubKey.toString());

        // 3 - Geração e autenticação de assinatura digital
		Signature ecdsa = Signature.getInstance("ECDSA", "BC");
		ecdsa.initSign(prvKey);

		String m = "message";
		ecdsa.update(m.getBytes());

		byte[] sig = ecdsa.sign();

		MenuItem jTFAssinatura = new MenuItem();
		jTFAssinatura.setText(sig.toString());

        // 4 - Verificação
		ecdsa.initVerify(pubKey);
		ecdsa.update(m.getBytes());

//      descomentar para burlar a mensagem
//		String novaMensagem = "nova mensagem";
//		ecdsa.update(novaMensagem.getBytes());

        // 4 - Verificação
		boolean sigok = ecdsa.verify(sig);

		System.out.println(sigok);
	}

}
