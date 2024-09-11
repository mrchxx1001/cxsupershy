let selectedIcon = null; // 선택된 아이콘을 저장할 변수

function selectIcon(iconNumber) {
    selectedIcon = iconNumber; // 선택한 아이콘 번호 저장
    console.log("Icon " + selectedIcon + " selected");
}

function previousPage() {
    console.log("이전 화면으로 이동");
    window.location.href = '/set-nickname'; // 이전 페이지로 이동
}

function nextPage() {
    if (!selectedIcon) {
        alert("아이콘을 선택해주세요!"); // 아이콘이 선택되지 않은 경우 알림
        return;
    }

    window.location.href = '/custom-mode'; // 다음 페이지로 이동하면서 선택한 아이콘 정보를 URL에 전달
}

document.querySelector(".previous").addEventListener("click", previousPage);
document.querySelector(".next").addEventListener("click", nextPage);
