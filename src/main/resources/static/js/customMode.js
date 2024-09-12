// URL에서 선택된 아이콘 값을 추출하는 함수
function getSelectedIcon() {
    const params = new URLSearchParams(window.location.search);
    return params.get('icon'); // URL에서 'icon' 파라미터 값을 가져옴
}

document.addEventListener("DOMContentLoaded", function() {
    const selectedIcon = getSelectedIcon();
    console.log("선택된 아이콘: " + selectedIcon);

    let selectedCount = 0; //선택된 버튼의 수를 추적하는 변수
    const maxSelection = 4; //최대 선택 가능한 버튼 수


    // 관심 모드 선택 버튼 클릭 이벤트 추가
    document.querySelectorAll('.interest-button').forEach(button => {
        button.addEventListener('click', function() {
            const state = this.getAttribute('data-state');

            if (state === 'plus') {
                if(selectedCount < maxSelection){
                    this.classList.add('selected');
                    this.querySelector('span').textContent = '-';
                    this.setAttribute('data-state', 'minus');
                    selectedCount++; //선택된 버튼 수 증가
                } else {
                    alert("모드는 4개까지만 선택 가능합니다."); //선택 제한 초과 시 알림창
                }
              } else {
                this.classList.remove('selected');
                this.querySelector('span').textContent = '+';
                this.setAttribute('data-state', 'plus');
                selectedCount--; //선택된 버튼 수 감소
            }
            console.log("현재 선택된 버튼 수 : " + selectedCount);
        });
    });

    // 다음 페이지로 이동하는 로직
    document.getElementById("nextBtn").addEventListener("click", function() {
    if(selectedCount > 0){ //최소 1개 이상 선택해야 함
        console.log("관심 모드를 선택 후 다음 화면으로 이동");
        window.location.href = '/custom-seat'; // 다음 페이지로 이동
        }
    });

    // 이전 페이지로 이동하는 로직
    document.getElementById("prevBtn").addEventListener("click", function() {
        window.history.back(); // 이전 페이지로 돌아가기
    });
});
