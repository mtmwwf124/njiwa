/*
 * Kasuku - Open Source eUICC Remote Subscription Management Server
 * 
 * 
 * Copyright (C) 2019 - , Digital Solutions Ltd. - http://www.dsmagic.com
 *
 * Paul Bagyenda <bagyenda@dsmagic.com>
 * 
 * This program is free software, distributed under the terms of
 * the GNU General Public License.
 */ 

/**
 * This class file was automatically generated by jASN1 v1.6.0 (http://www.openmuc.org)
 */

package io.njiwa.dp.pedefinitions;

import org.openmuc.jasn1.ber.BerByteArrayOutputStream;
import org.openmuc.jasn1.ber.BerIdentifier;
import org.openmuc.jasn1.ber.BerLength;
import org.openmuc.jasn1.ber.types.BerObjectIdentifier;

import java.io.IOException;
import java.io.InputStream;


public class PECSIM {

	public static final BerIdentifier identifier = new BerIdentifier(BerIdentifier.UNIVERSAL_CLASS, BerIdentifier.CONSTRUCTED, 16);
	protected BerIdentifier id;

	public byte[] code = null;
	private PEHeader csimHeader = null;

	private BerObjectIdentifier templateID = null;

	private File adfCsim = null;

	private File efArr = null;

	private File efCallCount = null;

	private File efImsiM = null;

	private File efImsiT = null;

	private File efTmsi = null;

	private File efAh = null;

	private File efAop = null;

	private File efAloc = null;

	private File efCdmahome = null;

	private File efZnregi = null;

	private File efSnregi = null;

	private File efDistregi = null;

	private File efAccolc = null;

	private File efTerm = null;

	private File efAcp = null;

	private File efPrl = null;

	private File efRuimid = null;

	private File efCsimSt = null;

	private File efSpc = null;

	private File efOtapaspc = null;

	private File efNamlock = null;

	private File efOta = null;

	private File efSp = null;

	private File efEsnMeidMe = null;

	private File efLi = null;

	private File efUsgind = null;

	private File efAd = null;

	private File efMaxPrl = null;

	private File efSpcs = null;

	private File efMecrp = null;

	private File efHomeTag = null;

	private File efGroupTag = null;

	private File efSpecificTag = null;

	private File efCallPrompt = null;

	public PECSIM() {
		id = identifier;
	}

	public PECSIM(byte[] code) {
		id = identifier;
		this.code = code;
	}

	public void setCsimHeader(PEHeader csimHeader) {
		this.csimHeader = csimHeader;
	}

	public PEHeader getCsimHeader() {
		return csimHeader;
	}

	public void setTemplateID(BerObjectIdentifier templateID) {
		this.templateID = templateID;
	}

	public BerObjectIdentifier getTemplateID() {
		return templateID;
	}

	public void setAdfCsim(File adfCsim) {
		this.adfCsim = adfCsim;
	}

	public File getAdfCsim() {
		return adfCsim;
	}

	public void setEfArr(File efArr) {
		this.efArr = efArr;
	}

	public File getEfArr() {
		return efArr;
	}

	public void setEfCallCount(File efCallCount) {
		this.efCallCount = efCallCount;
	}

	public File getEfCallCount() {
		return efCallCount;
	}

	public void setEfImsiM(File efImsiM) {
		this.efImsiM = efImsiM;
	}

	public File getEfImsiM() {
		return efImsiM;
	}

	public void setEfImsiT(File efImsiT) {
		this.efImsiT = efImsiT;
	}

	public File getEfImsiT() {
		return efImsiT;
	}

	public void setEfTmsi(File efTmsi) {
		this.efTmsi = efTmsi;
	}

	public File getEfTmsi() {
		return efTmsi;
	}

	public void setEfAh(File efAh) {
		this.efAh = efAh;
	}

	public File getEfAh() {
		return efAh;
	}

	public void setEfAop(File efAop) {
		this.efAop = efAop;
	}

	public File getEfAop() {
		return efAop;
	}

	public void setEfAloc(File efAloc) {
		this.efAloc = efAloc;
	}

	public File getEfAloc() {
		return efAloc;
	}

	public void setEfCdmahome(File efCdmahome) {
		this.efCdmahome = efCdmahome;
	}

	public File getEfCdmahome() {
		return efCdmahome;
	}

	public void setEfZnregi(File efZnregi) {
		this.efZnregi = efZnregi;
	}

	public File getEfZnregi() {
		return efZnregi;
	}

	public void setEfSnregi(File efSnregi) {
		this.efSnregi = efSnregi;
	}

	public File getEfSnregi() {
		return efSnregi;
	}

	public void setEfDistregi(File efDistregi) {
		this.efDistregi = efDistregi;
	}

	public File getEfDistregi() {
		return efDistregi;
	}

	public void setEfAccolc(File efAccolc) {
		this.efAccolc = efAccolc;
	}

	public File getEfAccolc() {
		return efAccolc;
	}

	public void setEfTerm(File efTerm) {
		this.efTerm = efTerm;
	}

	public File getEfTerm() {
		return efTerm;
	}

	public void setEfAcp(File efAcp) {
		this.efAcp = efAcp;
	}

	public File getEfAcp() {
		return efAcp;
	}

	public void setEfPrl(File efPrl) {
		this.efPrl = efPrl;
	}

	public File getEfPrl() {
		return efPrl;
	}

	public void setEfRuimid(File efRuimid) {
		this.efRuimid = efRuimid;
	}

	public File getEfRuimid() {
		return efRuimid;
	}

	public void setEfCsimSt(File efCsimSt) {
		this.efCsimSt = efCsimSt;
	}

	public File getEfCsimSt() {
		return efCsimSt;
	}

	public void setEfSpc(File efSpc) {
		this.efSpc = efSpc;
	}

	public File getEfSpc() {
		return efSpc;
	}

	public void setEfOtapaspc(File efOtapaspc) {
		this.efOtapaspc = efOtapaspc;
	}

	public File getEfOtapaspc() {
		return efOtapaspc;
	}

	public void setEfNamlock(File efNamlock) {
		this.efNamlock = efNamlock;
	}

	public File getEfNamlock() {
		return efNamlock;
	}

	public void setEfOta(File efOta) {
		this.efOta = efOta;
	}

	public File getEfOta() {
		return efOta;
	}

	public void setEfSp(File efSp) {
		this.efSp = efSp;
	}

	public File getEfSp() {
		return efSp;
	}

	public void setEfEsnMeidMe(File efEsnMeidMe) {
		this.efEsnMeidMe = efEsnMeidMe;
	}

	public File getEfEsnMeidMe() {
		return efEsnMeidMe;
	}

	public void setEfLi(File efLi) {
		this.efLi = efLi;
	}

	public File getEfLi() {
		return efLi;
	}

	public void setEfUsgind(File efUsgind) {
		this.efUsgind = efUsgind;
	}

	public File getEfUsgind() {
		return efUsgind;
	}

	public void setEfAd(File efAd) {
		this.efAd = efAd;
	}

	public File getEfAd() {
		return efAd;
	}

	public void setEfMaxPrl(File efMaxPrl) {
		this.efMaxPrl = efMaxPrl;
	}

	public File getEfMaxPrl() {
		return efMaxPrl;
	}

	public void setEfSpcs(File efSpcs) {
		this.efSpcs = efSpcs;
	}

	public File getEfSpcs() {
		return efSpcs;
	}

	public void setEfMecrp(File efMecrp) {
		this.efMecrp = efMecrp;
	}

	public File getEfMecrp() {
		return efMecrp;
	}

	public void setEfHomeTag(File efHomeTag) {
		this.efHomeTag = efHomeTag;
	}

	public File getEfHomeTag() {
		return efHomeTag;
	}

	public void setEfGroupTag(File efGroupTag) {
		this.efGroupTag = efGroupTag;
	}

	public File getEfGroupTag() {
		return efGroupTag;
	}

	public void setEfSpecificTag(File efSpecificTag) {
		this.efSpecificTag = efSpecificTag;
	}

	public File getEfSpecificTag() {
		return efSpecificTag;
	}

	public void setEfCallPrompt(File efCallPrompt) {
		this.efCallPrompt = efCallPrompt;
	}

	public File getEfCallPrompt() {
		return efCallPrompt;
	}

	public int encode(BerByteArrayOutputStream os, boolean explicit) throws IOException {

		int codeLength;

		if (code != null) {
			codeLength = code.length;
			for (int i = code.length - 1; i >= 0; i--) {
				os.write(code[i]);
			}
		}
		else {
			codeLength = 0;
			codeLength += efCallPrompt.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 36
			os.write(0x24);
			os.write(0xbf);
			codeLength += 2;
			
			codeLength += efSpecificTag.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 35
			os.write(0x23);
			os.write(0xbf);
			codeLength += 2;
			
			codeLength += efGroupTag.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 34
			os.write(0x22);
			os.write(0xbf);
			codeLength += 2;
			
			codeLength += efHomeTag.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 33
			os.write(0x21);
			os.write(0xbf);
			codeLength += 2;
			
			codeLength += efMecrp.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 32
			os.write(0x20);
			os.write(0xbf);
			codeLength += 2;
			
			codeLength += efSpcs.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 31
			os.write(0x1f);
			os.write(0xbf);
			codeLength += 2;
			
			codeLength += efMaxPrl.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 30
			os.write(0xbe);
			codeLength += 1;
			
			codeLength += efAd.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 29
			os.write(0xbd);
			codeLength += 1;
			
			codeLength += efUsgind.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 28
			os.write(0xbc);
			codeLength += 1;
			
			codeLength += efLi.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 27
			os.write(0xbb);
			codeLength += 1;
			
			codeLength += efEsnMeidMe.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 26
			os.write(0xba);
			codeLength += 1;
			
			codeLength += efSp.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 25
			os.write(0xb9);
			codeLength += 1;
			
			codeLength += efOta.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 24
			os.write(0xb8);
			codeLength += 1;
			
			codeLength += efNamlock.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 23
			os.write(0xb7);
			codeLength += 1;
			
			codeLength += efOtapaspc.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 22
			os.write(0xb6);
			codeLength += 1;
			
			codeLength += efSpc.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 21
			os.write(0xb5);
			codeLength += 1;
			
			codeLength += efCsimSt.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 20
			os.write(0xb4);
			codeLength += 1;
			
			codeLength += efRuimid.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 19
			os.write(0xb3);
			codeLength += 1;
			
			codeLength += efPrl.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 18
			os.write(0xb2);
			codeLength += 1;
			
			codeLength += efAcp.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 17
			os.write(0xb1);
			codeLength += 1;
			
			codeLength += efTerm.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 16
			os.write(0xb0);
			codeLength += 1;
			
			codeLength += efAccolc.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 15
			os.write(0xaf);
			codeLength += 1;
			
			codeLength += efDistregi.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 14
			os.write(0xae);
			codeLength += 1;
			
			codeLength += efSnregi.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 13
			os.write(0xad);
			codeLength += 1;
			
			codeLength += efZnregi.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 12
			os.write(0xac);
			codeLength += 1;
			
			codeLength += efCdmahome.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 11
			os.write(0xab);
			codeLength += 1;
			
			codeLength += efAloc.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 10
			os.write(0xaa);
			codeLength += 1;
			
			codeLength += efAop.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 9
			os.write(0xa9);
			codeLength += 1;
			
			codeLength += efAh.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
			os.write(0xa8);
			codeLength += 1;
			
			codeLength += efTmsi.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 7
			os.write(0xa7);
			codeLength += 1;
			
			codeLength += efImsiT.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
			os.write(0xa6);
			codeLength += 1;
			
			codeLength += efImsiM.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			os.write(0xa5);
			codeLength += 1;
			
			codeLength += efCallCount.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
			os.write(0xa4);
			codeLength += 1;
			
			codeLength += efArr.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
			os.write(0xa3);
			codeLength += 1;
			
			codeLength += adfCsim.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
			os.write(0xa2);
			codeLength += 1;
			
			codeLength += templateID.encode(os, false);
			// write tag: CONTEXT_CLASS, PRIMITIVE, 1
			os.write(0x81);
			codeLength += 1;
			
			codeLength += csimHeader.encode(os, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
			os.write(0xa0);
			codeLength += 1;
			
			codeLength += BerLength.encodeLength(os, codeLength);
		}

		if (explicit) {
			codeLength += id.encode(os);
		}

		return codeLength;

	}

	public int decode(InputStream is, boolean explicit) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerIdentifier berIdentifier = new BerIdentifier();

		if (explicit) {
			codeLength += id.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		int totalLength = length.val;
		codeLength += totalLength;

		subCodeLength += berIdentifier.decode(is);
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 0)) {
			csimHeader = new PEHeader();
			subCodeLength += csimHeader.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.PRIMITIVE, 1)) {
			templateID = new BerObjectIdentifier();
			subCodeLength += templateID.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 2)) {
			adfCsim = new File();
			subCodeLength += adfCsim.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 3)) {
			efArr = new File();
			subCodeLength += efArr.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 4)) {
			efCallCount = new File();
			subCodeLength += efCallCount.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 5)) {
			efImsiM = new File();
			subCodeLength += efImsiM.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 6)) {
			efImsiT = new File();
			subCodeLength += efImsiT.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 7)) {
			efTmsi = new File();
			subCodeLength += efTmsi.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 8)) {
			efAh = new File();
			subCodeLength += efAh.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 9)) {
			efAop = new File();
			subCodeLength += efAop.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 10)) {
			efAloc = new File();
			subCodeLength += efAloc.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 11)) {
			efCdmahome = new File();
			subCodeLength += efCdmahome.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 12)) {
			efZnregi = new File();
			subCodeLength += efZnregi.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 13)) {
			efSnregi = new File();
			subCodeLength += efSnregi.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 14)) {
			efDistregi = new File();
			subCodeLength += efDistregi.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 15)) {
			efAccolc = new File();
			subCodeLength += efAccolc.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 16)) {
			efTerm = new File();
			subCodeLength += efTerm.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 17)) {
			efAcp = new File();
			subCodeLength += efAcp.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 18)) {
			efPrl = new File();
			subCodeLength += efPrl.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 19)) {
			efRuimid = new File();
			subCodeLength += efRuimid.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 20)) {
			efCsimSt = new File();
			subCodeLength += efCsimSt.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 21)) {
			efSpc = new File();
			subCodeLength += efSpc.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 22)) {
			efOtapaspc = new File();
			subCodeLength += efOtapaspc.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 23)) {
			efNamlock = new File();
			subCodeLength += efNamlock.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 24)) {
			efOta = new File();
			subCodeLength += efOta.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 25)) {
			efSp = new File();
			subCodeLength += efSp.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 26)) {
			efEsnMeidMe = new File();
			subCodeLength += efEsnMeidMe.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 27)) {
			efLi = new File();
			subCodeLength += efLi.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 28)) {
			efUsgind = new File();
			subCodeLength += efUsgind.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 29)) {
			efAd = new File();
			subCodeLength += efAd.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 30)) {
			efMaxPrl = new File();
			subCodeLength += efMaxPrl.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 31)) {
			efSpcs = new File();
			subCodeLength += efSpcs.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 32)) {
			efMecrp = new File();
			subCodeLength += efMecrp.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 33)) {
			efHomeTag = new File();
			subCodeLength += efHomeTag.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 34)) {
			efGroupTag = new File();
			subCodeLength += efGroupTag.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 35)) {
			efSpecificTag = new File();
			subCodeLength += efSpecificTag.decode(is, false);
			subCodeLength += berIdentifier.decode(is);
		}
		else {
			throw new IOException("Identifier does not match the mandatory sequence element identifer.");
		}
		
		if (berIdentifier.equals(BerIdentifier.CONTEXT_CLASS, BerIdentifier.CONSTRUCTED, 36)) {
			efCallPrompt = new File();
			subCodeLength += efCallPrompt.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
		}
		throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

		
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		BerByteArrayOutputStream os = new BerByteArrayOutputStream(encodingSizeGuess);
		encode(os, false);
		code = os.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("SEQUENCE{");
		sb.append("csimHeader: ").append(csimHeader);
		
		sb.append(", ");
		sb.append("templateID: ").append(templateID);
		
		sb.append(", ");
		sb.append("adfCsim: ").append(adfCsim);
		
		sb.append(", ");
		sb.append("efArr: ").append(efArr);
		
		sb.append(", ");
		sb.append("efCallCount: ").append(efCallCount);
		
		sb.append(", ");
		sb.append("efImsiM: ").append(efImsiM);
		
		sb.append(", ");
		sb.append("efImsiT: ").append(efImsiT);
		
		sb.append(", ");
		sb.append("efTmsi: ").append(efTmsi);
		
		sb.append(", ");
		sb.append("efAh: ").append(efAh);
		
		sb.append(", ");
		sb.append("efAop: ").append(efAop);
		
		sb.append(", ");
		sb.append("efAloc: ").append(efAloc);
		
		sb.append(", ");
		sb.append("efCdmahome: ").append(efCdmahome);
		
		sb.append(", ");
		sb.append("efZnregi: ").append(efZnregi);
		
		sb.append(", ");
		sb.append("efSnregi: ").append(efSnregi);
		
		sb.append(", ");
		sb.append("efDistregi: ").append(efDistregi);
		
		sb.append(", ");
		sb.append("efAccolc: ").append(efAccolc);
		
		sb.append(", ");
		sb.append("efTerm: ").append(efTerm);
		
		sb.append(", ");
		sb.append("efAcp: ").append(efAcp);
		
		sb.append(", ");
		sb.append("efPrl: ").append(efPrl);
		
		sb.append(", ");
		sb.append("efRuimid: ").append(efRuimid);
		
		sb.append(", ");
		sb.append("efCsimSt: ").append(efCsimSt);
		
		sb.append(", ");
		sb.append("efSpc: ").append(efSpc);
		
		sb.append(", ");
		sb.append("efOtapaspc: ").append(efOtapaspc);
		
		sb.append(", ");
		sb.append("efNamlock: ").append(efNamlock);
		
		sb.append(", ");
		sb.append("efOta: ").append(efOta);
		
		sb.append(", ");
		sb.append("efSp: ").append(efSp);
		
		sb.append(", ");
		sb.append("efEsnMeidMe: ").append(efEsnMeidMe);
		
		sb.append(", ");
		sb.append("efLi: ").append(efLi);
		
		sb.append(", ");
		sb.append("efUsgind: ").append(efUsgind);
		
		sb.append(", ");
		sb.append("efAd: ").append(efAd);
		
		sb.append(", ");
		sb.append("efMaxPrl: ").append(efMaxPrl);
		
		sb.append(", ");
		sb.append("efSpcs: ").append(efSpcs);
		
		sb.append(", ");
		sb.append("efMecrp: ").append(efMecrp);
		
		sb.append(", ");
		sb.append("efHomeTag: ").append(efHomeTag);
		
		sb.append(", ");
		sb.append("efGroupTag: ").append(efGroupTag);
		
		sb.append(", ");
		sb.append("efSpecificTag: ").append(efSpecificTag);
		
		sb.append(", ");
		sb.append("efCallPrompt: ").append(efCallPrompt);
		
		sb.append("}");
		return sb.toString();
	}

}
