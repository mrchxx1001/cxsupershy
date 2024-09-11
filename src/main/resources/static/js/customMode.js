// URL에서 선택된 아이콘 값을 추출하는 함수
function getSelectedIcon() {
    const params = new URLSearchParams(window.location.search);
    return params.get('icon'); // URL에서 'icon' 파라미터 값을 가져옴
}

document.addEventListener("DOMContentLoaded", function() {
    const selectedIcon = getSelectedIcon();
    console.log("선택된 아이콘: " + selectedIcon);

    // 관심 모드 선택 버튼 클릭 이벤트 추가
    document.querySelectorAll('.interest-button').forEach(button => {
        button.addEventListener('click', function() {
            const state = this.getAttribute('data-state');

            if (state === 'plus') {
                this.classList.add('selected');
                this.querySelector('span').textContent = '-';
                this.setAttribute('data-state', 'minus');
            } else {
                this.classList.remove('selected');
                this.querySelector('span').textContent = '+';
                this.setAttribute('data-state', 'plus');
            }
        });
    });

    // 다음 페이지로 이동하는 로직
    document.getElementById("nextBtn").addEventListener("click", function() {
        console.log("관심 모드를 선택 후 다음 화면으로 이동");
        window.location.href = '/next-page'; // 다음 페이지로 이동
    });

    // 이전 페이지로 이동하는 로직
    document.getElementById("prevBtn").addEventListener("click", function() {
        window.history.back(); // 이전 페이지로 돌아가기
    });
});
