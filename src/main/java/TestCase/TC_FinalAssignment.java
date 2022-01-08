package TestCase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import pages.Step;

import static core.AppiumBase.driver;
import static core.AppiumBase.getDriver;
import static pages.Element.*;

public class TC_FinalAssignment {
    Step step;

    @Given("Open app shoppiness")
    public void open_app_shoppiness() {
       step= new Step(getDriver());
    }
    @When("user click button BatDauTraiNghiem")
    public void user_click_button_bat_dau_trai_nghiem() {
        step.click(btn_BatDauTraiNghiem);
    }

    @And("user click button Deny")
    public void userClickButtonDeny() {
        step.click(btn_Deny);
    }

    @Then("Cart icon, Search icon,button Bắt đầu ngay should be display")
    public void cartIconSearchIconButtonBắtĐầuNgayShouldBeDisplay() {
        step.verifyElementPresent(icon_Card);
        step.verifyElementPresent(icon_Search);
        step.verifyElementPresent(btn_BatDauNgay);
    }

    @And("Button Hoàntiền, thương hiệu, ưuđãi, voucher and cánhân should be display")
    public void buttonHoàntiềnThươngHiệuƯuđãiVoucherAndCánhânShouldBeDisplay() {
        step.verifyElementPresent(icon_HoanTien);
        step.verifyElementPresent(icon_ThuongHieu);
        step.verifyElementPresent(icon_UuDai);
        step.verifyElementPresent(icon_Voucher);
        step.verifyElementPresent(icon_CaNhan);
    }

    @When("user click button ThuongHieu")
    public void user_click_button_thuong_hieu() throws InterruptedException {
        //Do app mở lên lần đầu lên em phải click 2 lần
        step.click(icon_ThuongHieu);
        Thread.sleep(3000);
        step.click(icon_ThuongHieu);
    }
    @Then("The screen should be displayed {int} branch name.")
    public void the_screen_should_be_displayed_branch_name(Integer int1) {
        //Verify 9 brand name
       for(int i=1;i <= int1;i++){
           step.verifyElementPresent("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup["
                   +i+"]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.ImageView[1]");
       }
    }

    @And("user click button UuDai")
    public void userClickButtonUuDai() throws InterruptedException {
        //Do app mở lên lần đầu lên em phải click 2 lần
        step.click(icon_UuDai);
        Thread.sleep(3000);
        step.click(icon_UuDai);

    }

    @And("user click frist product")
    public void userClickFristProduct() throws InterruptedException {
        //Do app mở lên lần đầu lên em phải click 2 lần
        step.click(fristProduct_Tc3);
        Thread.sleep(3000);
        step.click(fristProduct_Tc3);
    }

    @Then("DiscountImage, Description, ưuđãi, Mua & nhận hoàn tiền button should be display")
    public void discountimageDescriptionƯuđãiMuaNhậnHoànTiềnButtonShouldBeDisplay() {
        step.verifyElementPresent(imageDiscount_Tc3);
        step.verifyElementPresent(Description_Tc3);
        step.verifyElementPresent(btn_HoanTien_Tc3);
    }


    @And("user click button Voucher")
    public void userClickButtonVoucher() throws InterruptedException {
        //Do app mở lên lần đầu lên em phải click 2 lần
        step.click(icon_Voucher);
        Thread.sleep(3000);
        step.click(icon_Voucher);
    }

    @And("Swipe and click to the last Voucher")
    public void swipeAndClickToTheLastVoucher() {
        step.swipeDownElement(txt_lastVoucher);
        step.click(txt_lastVoucher);

    }

    @Then("Voucher Image,VoucherDescription,Mua ngay button,Add cart icon should be display")
    public void voucherImageVoucherDescriptionMuaNgayButtonAddCartIconShouldBeDisplay() {
        step.verifyElementPresent(imageVoucher_Tc4);
        step.verifyElementPresent(descriptionVoucher_Tc4);
        step.verifyElementPresent(btn_MuaNgay_Tc4);
        step.verifyElementPresent(icon_AddCard_Tc4);
    }

    @And("user click button CaNhan")
    public void userClickButtonCaNhan() throws InterruptedException {
        //Do app mở lên lần đầu lên em phải click 2 lần
        step.click(icon_CaNhan);
        Thread.sleep(3000);
        step.click(icon_CaNhan);
    }

    @Then(": Mã ưu đãi,UuDai,Voucher,ThuongHieu should be display")
    public void mãƯuĐãiUuDaiVoucherThuongHieuShouldBeDisplay() {
        step.verifyElementPresent(txt_MaUuDai_Tc5);
        step.verifyElementPresent(txt_UuDai_Tc5);
        step.verifyElementPresent(txt_Voucher_Tc5);
        step.verifyElementPresent(txt_ThuongHieu_Tc5);
    }

    @And("user click button MuaTheDienThoai")
    public void userClickButtonMuaTheDienThoai() throws InterruptedException {
        //Do app mở lên lần đầu lên em phải click 2 lần
        step.click(icon_MuaTheDienThoai_Tc6);
        Thread.sleep(3000);
        step.click(icon_MuaTheDienThoai_Tc6);
    }

    @Then(": {int} logo and {int} nominal value should be display")
    public void logoAndNominalValueShouldBeDisplay(int arg0, int arg1) {
        //verify 4 logo
        for(int i =1;i<=arg0;i++){
            step.verifyElementPresent("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/" +
                    "android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ImageView[" +i+"]");
        }
        //verify 6 nominal value
        for(int i=1;i<=arg1;i++){
            step.verifyElementPresent("\t\n" +
                    "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/" +
                    "android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView["+i+"]");
        }
    }
}
