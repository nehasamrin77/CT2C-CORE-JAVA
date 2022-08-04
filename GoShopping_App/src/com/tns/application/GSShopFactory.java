package com.tns.application;

import com.tns.framework.NormalAcc;
import com.tns.framework.ShopFactory;
public class GSShopFactory extends ShopFactory{

//@Override method
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc GsPrime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		System.out.println(GsPrime.toString());
		return GsPrime;
	}
//@Override method
	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, boolean isPrime) {
		GSNormalAcc GsNormal = new GSNormalAcc(accNo, accNm, charges, isPrime);
		System.out.println(GsNormal.toString());
		return GsNormal;
	}
@Override
public NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
	// TODO Auto-generated method stub
	return null;
}
}
