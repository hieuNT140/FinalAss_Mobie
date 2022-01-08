Feature: Final Assignment

@
  Scenario: TC1
    Given Open app shoppiness
    When user click button BatDauTraiNghiem
    And user click button Deny
    Then  Cart icon, Search icon,button Bắt đầu ngay should be display
    And Button Hoàntiền, thương hiệu, ưuđãi, voucher and cánhân should be display


  Scenario: TC2
    Given Open app shoppiness
    When user click button BatDauTraiNghiem
    And user click button Deny
    And user click button ThuongHieu
    Then  The screen should be displayed 9 branch name.

  Scenario: TC3
    Given Open app shoppiness
    When user click button BatDauTraiNghiem
    And user click button Deny
    And user click button UuDai
    And user click frist product
    Then DiscountImage, Description, ưuđãi, Mua & nhận hoàn tiền button should be display


  Scenario: TC4
    Given Open app shoppiness
    When user click button BatDauTraiNghiem
    And user click button Deny
    And user click button Voucher
    And Swipe and click to the last Voucher
    Then Voucher Image,VoucherDescription,Mua ngay button,Add cart icon should be display

  Scenario: TC5
    Given Open app shoppiness
    When user click button BatDauTraiNghiem
    And user click button Deny
    And user click button CaNhan
    Then : Mã ưu đãi,UuDai,Voucher,ThuongHieu should be display

  Scenario: TC6
    Given Open app shoppiness
    When user click button BatDauTraiNghiem
    And user click button Deny
    And user click button MuaTheDienThoai
    Then : 4 logo and 6 nominal value should be display
