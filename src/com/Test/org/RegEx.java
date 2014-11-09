package com.Test.org;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	//CPO created
	/*String regexpattern="(\\[[C|c][P|p][O|o]\\])([;])(\\[[C|c][R|r][E|e][A|a][T|t][E|e][D|d]\\])([;])([S|s][O|o][:].*)([;])([B|b][2][B|b])([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])([P|p][O|o]\\:.*)([;])([a-zA-Z0-9]*)([;])([E|e][R|r][P|p]\\:[a-zA-Z0-9]*)([;])";
	String matchingData="[CPO];[Created];SO:1827965;B2B;PT-PRT;2013-03-28;1000000098;FRANCE TELECOM;PO:60495735/v1;L60110;ERP:;";*/
	//PO Notification to create WI SR1
	String regexpattern="(\\[[P|p][O|o]\\])([;])(\\[[N|n][O|o][T|t][I|i][F|f][I|i][C|c][A|a][T|t][I|i][O|o][N|n]\\])([;])([M|m][S|s][G|g][:][a-zA-Z0-9]*)([;])([B|b][2][B|b])([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])([P|p][O|o]\\:.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)";
	String matchingData="[PO];[Notification];Msg:646832;B2B;PT-PRT;2013-09-02;1000000020;BELGACOM;PO:4570656802;395.08;EUR;L60090;Cnv:463369;New;SOD";
	//CDR for Dispatch to create WI SR86
	/*String regexpattern="(\\[[C|c][D|d][R|r]\\])([;])(\\[[F|f][O|o][R|r]\\s[D|d][I|i][S|s][P|p][A|a][T|t][C|c][H|h]\\])([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])([P|p][O|o]\\:.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)";
	String matchingData="[CDR];[For Dispatch];CD:1165919;OLA;FR-CIT;2013-05-03;1000022317;SFR;PO:99993333355677;1234567677.0;EUR;L01300;FC:;;SOD";*/
	//CDR for Elaboration to create WI SR6
	/*String regexpattern="(\\[[C|c][D|d][R|r]\\])([;])(\\[[F|f][O|o][R|r]\\s[E|e][L|l][A|a][B|b][O|o][R|r][A|a][T|t][I|i][O|o][N|n]\\])([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])([P|p][O|o]\\:.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)";
	String matchingData="[CDR];[For Elaboration];CD:1165920;OLA;FR-CIT;2013-05-03;1000022317;SFR;PO:123344556;123456.0;EUR;L01300;FC:;;SOD";*/
	//Creq Submit To Create WI
	/*String regexpattern="(\\[[C|c][R|r][E|e][Q|q]\\])([;])(\\[[S|s][U|u][B|b][M|m][I|i][T|t]\\])([;])([S|s][O|o][:].*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])([P|p][O|o]\\:.*)([;])([E|e][R|r][P|p]\\:[a-zA-Z0-9]*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)";
	String matchingData="[CREQ];[Submit];SO:1812724;88070;PT-PRT;2013-04-16;1000000121;EIRCOM LTD;PO:TE4500443618;ERP:1011036273;Invoice TE4500443618;L60210;OECHANGE-;SOD";*/
	//Raise Exception
	/*String regexpattern="(\\[[C|c][R|r][E|e][Q|q]\\])([;])(\\[[S|s][U|u][B|b][M|m][I|i][T|t]\\])([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])([P|p][O|o]\\:.*)([;])(.*)([;])([W|w][I|i]\\:[0-9][0-9]*)([;])([R|r][C|c][A|a]\\:([0-9][0-9]*\\.[0-9][0-9]*).*)([;])(.*)([;])(.*)([;])(.*)";
	String matchingData="[CREQ];[Submit];SO:1827966;75482;FR-CIT;2013-04-03;1000000098;FRANCE TELECOM;PO:1111144444;ERP:;WI:119133;RCA:2.04;L12040;SOD;";*/
	//Release Exception
	/*String regexpattern="(\\[[C|c][R|r][E|e][Q|q]\\])([;])(\\[[C|c][O|o][M|m][P|p][L|l][E|e][T|t][E|e]\\])([;])([S|s][O|o]\\:.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])([P|p][O|o]\\:.*)([;])(.*)([;])([W|w][I|i]\\:[0-9][0-9]*)([;])([R|r][C|c][A|a]\\:([0-9][0-9]*\\.[0-9][0-9]*).*)([;])([a-zA-Z0-9]*)([;])(.*)([;])(.*)";
	String matchingData="[CREQ];[Complete];SO:1827966;75482;FR-CIT;2013-04-03;1000000098;FRANCE TELECOM;PO:1111144444;ERP:;WI:119133;RCA:2.04;L12040;SOD;";*/
	//Complete WI CREQ ACCEPTED
	/*String regexpattern="(\\[[C|c][R|r][E|e][Q|q]\\])([;])(\\[[A|a][C|c][C|c][E|e][P|p][T|t][E|e][D|d]\\])([;])(.*)([;])([a-zA-Z0-9]*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])([W|w][I|i]\\:[0-9]*)([;])(.*)([;])(.*)([;])(.*)";
	String matchingData="[CREQ];[Accepted];SO:1899707;101342;KZ-NKZ;2013-07-04;1000018456;TELEFONICA O2 U;PO:4010221812;ERP:1011104818;WI:28514;L61060;OE-;SOD";*/
	//Complete WI CREQ REGISTERED
	/*String regexpattern="(\\[[C|c][D|r][R|r]\\])([;])(\\[[R|r][E|e][G|g][I|i][S|s][T|t][E|e][R|r][E|e][D|d]\\])([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])((.*)[W|w][I|i]\\:[0-9]*)([;])(.*)";
	String matchingData="[CDR];[Registered];CD:1179619;Other;KZ-NKZ;2013-09-05;1000000014;TELSTRA CORPORATION;PO:CUST-DOC-ID-12345;12345.9900;EUR;L60090;FC:;WI:126132;SOD";*/
	// CREQ Queried to reject the mail
	/*String regexpattern="(\\[[C|c][R|r][E|e][Q|q]\\])([;])(\\[[Q|q][U|u][E|e][R|r][I|i][E|e][D|d]\\])([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)([;])(.*)";
	String matchingData="[Creq];[Queried];CD:1179619;Other;KZ-NKZ;2013-09-05;1000000014;TELSTRA CORPORATION;PO:CUST-DOC-ID-12345;12345.9900;EUR;L60090;FC:;SOD";*/
	
	
	Pattern pattern = Pattern.compile(regexpattern);
	Matcher matcher = pattern.matcher(matchingData);
	if(matcher.matches()){
		System.out.println("Matcher");
		
	}else{
		System.out.println("Non Matcher");
	}
	
    }

}
