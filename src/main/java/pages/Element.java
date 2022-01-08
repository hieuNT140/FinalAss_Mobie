package pages;

import org.openqa.selenium.By;

public class Element {
    //Element Tc1+Tc2
    public static By btn_BatDauTraiNghiem = By.id("com.nct.shopiness:id/btn_trai_nghiem");
    public static By btn_Deny = By.id("com.android.permissioncontroller:id/permission_deny_button");
    public static By icon_Card = By.id("com.nct.shopiness:id/icn_giohang");
    public static By icon_Search = By.id("com.nct.shopiness:id/menu_item_search");
    public static By btn_BatDauNgay = By.id("com.nct.shopiness:id/btn_try_cash_back");
    public static By icon_HoanTien = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Hoàn tiền\"]/android.widget.RelativeLayout");
    public static By icon_ThuongHieu = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Thương hiệu\"]/android.widget.RelativeLayout");
    public static By icon_UuDai = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Ưu đãi\"]/android.widget.RelativeLayout");
    public static By icon_Voucher = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Voucher\"]/android.widget.RelativeLayout");
    public static By icon_CaNhan = By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Cá nhân\"]/android.widget.RelativeLayout");

    //Element Tc3
    public static By fristProduct_Tc3=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.ImageView[2]");
    public static By Description_Tc3=By.id("com.nct.shopiness:id/rating_criteria_text_view");
    public static By imageDiscount_Tc3=By.id("com.nct.shopiness:id/deal_image_view");
    public static By btn_HoanTien_Tc3=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.Button");

    //element Tc4
    public static By txt_lastVoucher=By.xpath("//*[@text='Voucher tiền mặt trị giá 20K tại Grab']");
    public static By imageVoucher_Tc4=By.id("com.nct.shopiness:id/imgView");
    public static By descriptionVoucher_Tc4=By.id("com.nct.shopiness:id/tv_description");
    public static By btn_MuaNgay_Tc4=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.Button[1]");
    public static By icon_AddCard_Tc4=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.Button[2]");


    //element Tc5
    public static By txt_MaUuDai_Tc5 =By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Mã ưu đãi\"]/android.widget.TextView");
    public static By txt_UuDai_Tc5 =By.xpath("(//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Ưu đãi\"])[1]/android.widget.TextView");
    public static By txt_Voucher_Tc5 =By.xpath("(//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Voucher\"])[1]/android.widget.TextView");
    public static By txt_ThuongHieu_Tc5 =By.xpath("(//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Thương hiệu\"])[1]/android.widget.TextView");

    //element Tc6
    public static By icon_MuaTheDienThoai_Tc6=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]");

}
