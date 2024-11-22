let mail_row = document.getElementById("mail_content");
let mail_empty = document.getElementById("mail_empty");

window.onload = () => {
    if (mail_row.rows.length <= 0) {
        mail_empty.style.display = "";
        console.log("보여짐")
    } else {
        mail_empty.style.display = "none";
        console.log("숨김")
    }
}

let mail_all_check = document.getElementsByClassName("all_check")[0];
mail_all_check.addEventListener(("change"), () => {
    for (let i=0; i<mail_row.rows.length; i++) {
        mail_row.rows[i].cells[0].children[0].checked = mail_all_check.checked
    }
});

document.querySelectorAll(".one_check").forEach((check) => {
    check.addEventListener("change", () => {
        for (let i=0; i<mail_row.rows.length; i++) {
            if (!(mail_row.rows[i].cells[0].children[0].checked)) {
                mail_all_check.checked = false;
                return;
            }
            mail_all_check.checked = true;
        }
    });
});

let mail_delete = document.getElementsByClassName("mail_delete")[0]
mail_delete.addEventListener("click", () => {
    if (!(confirm("정말로 삭제하시겠습니까?"))) {
        return;
    }
    let mail_check = document.querySelectorAll(".one_check");
    let check_count = 0;
    for (let i=0; i<mail_check.length; i++) {
        console.log(mail_check[i].checked);
        if (mail_check[i].checked) {
            check_count++;
        }
    }
    if (check_count <= 0) {
        mail_check = document.querySelectorAll(".one_check");
        alert("삭제할 메일을 선택해주세요.");
    }

    for (let i=0; i<mail_row.rows.length; i++) {
        if (mail_row.rows[i].cells[0].children[0].checked) {
            mail_row.deleteRow(i);
            i--;
        }
    }

    if (mail_row.rows.length <= 0) {
        mail_empty.style.display = "";
    } else {
        mail_empty.style.display = "none";
    }

    mail_all_check.checked = false;
});
