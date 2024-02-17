import java.security.*;

import javafx.scene.control.MenuItem;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;

public class ECDSAApplication {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException, InvalidKeyException, SignatureException {
		ECNamedCurveParameterSpec ECCparam = ECNamedCurveTable.getParameterSpec("prime192v2");

		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());

		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("ECDSA", "BC");

		keyGen.initialize(ECCparam);
		KeyPair keyPair = keyGen.generateKeyPair();

		PublicKey pubKey = keyPair.getPublic();
		PrivateKey prvKey = keyPair.getPrivate();

		MenuItem jTACPrivada =  new MenuItem();
		jTACPrivada.setText(prvKey.toString());
		MenuItem jTACPublica = new MenuItem();
		jTACPublica.setText(pubKey.toString());

		Signature ecdsa = Signature.getInstance("ECDSA", "BC");
		ecdsa.initSign(prvKey);

		String m = "message";
		ecdsa.update(m.getBytes());

		byte[] sig = ecdsa.sign();

		MenuItem jTFAssinatura = new MenuItem();
		jTFAssinatura.setText(sig.toString());

		ecdsa.initVerify(pubKey);
		ecdsa.update(m.getBytes());

//		String novaMensagem = "nova mensagem";
//		ecdsa.update(novaMensagem.getBytes());

		boolean sigok = ecdsa.verify(sig);

		System.out.println(sigok);
	}

}
