# A3_231A290036 - Thiết kế giao diện với XML Layout & Tài nguyên

**Môn học:** INT4211 – Lập trình trên các thiết bị di động  
**Họ và tên:** Võ Văn Quốc Bảo  
**MSSV:** 231A290036  
**Lớp:** 231A2901  

## Giới thiệu
Dự án Lab A3 thực hành thiết kế giao diện Android bằng XML Layout, tách tài nguyên (`strings.xml`, `colors.xml`, `dimens.xml`, `styles.xml`), xây dựng giao diện lồng ghép với `LinearLayout`, `FrameLayout` (overlay avatar), thiết kế phẳng bằng `ConstraintLayout` và tạo layout đa màn hình (`layout-land`, `layout-sw600dp`, Dark Mode `values-night`).

## Các tính năng & Bài nâng cao
- **Bản LinearLayout:** `activity_main.xml` (Giao diện chuẩn bọc trong ScrollView, dùng FrameLayout cho avatar).
- **Bản ConstraintLayout:** `activity_constraint_demo.xml` (Tối ưu độ phẳng layout, dùng Guideline, Chain, match_constraint).
- **Màn hình ngang:** `res/layout-land/activity_main.xml` (Layout 2 cột giữ nguyên View ID).
- **NC1 (Dark Mode):** Cấu hình `res/values-night/colors.xml` tương thích chế độ tối.
- **NC2 (Máy tính bảng):** Bố cục 2 cột cho Tablet qua `res/layout-sw600dp/activity_main.xml`.
- **NC3 (Material Styles):** Tách `style` dùng lại trong `styles.xml`.
- **NC4 (Màn hình Đăng ký):** Dựng `RegisterActivity` dùng `ConstraintLayout` và `<include>` thẻ hồ sơ sinh viên.
