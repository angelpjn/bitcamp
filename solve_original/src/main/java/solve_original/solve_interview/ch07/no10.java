/*
7.10 지뢰찾기 : 텍스트 기반의 지뢰찾기(Minesweeper) 게임을 설계하고 구현하라.
지뢰찾기는 N X N 격자판에 숨겨진 B개의 지뢰를 찾는 고전적인 컴퓨터 게임이다.
지뢰가 없는 셀(cell)에는 아무것도 적혀 있기 않거나 인접한 여덟 방향에 숨겨진 지뢰의 개수가 적혀 있다.
플레이어는 각 셀을 확인해 볼 수 있는데, 확인한 셀에 지뢰가 있다면 그 즉시 게임에서 진다.
확인한 셀에 숫자가 적혀 있다면 그 값이 공개된다.
해당 셀이 비어 있다면 인접한 비어 있는 셀(숫자로 둘러싸인 셀을 만나기 전까지) 또한 모두 공개된다.
지뢰가 없는 모든 셀을 전부 공개된 상태로 바꿔 놓으면 블레이어가 이긴다.
지뢰가 있을 것 같은 위치에 깃발을 꽂아 표시해둘 수 있는데, 깃발을 꽂는 것은 게임에 아무런 영향을 미치지 않는다.
실수로 잘못 클릭하는 상황을 방지하기 위한 기능일 뿐이다.

0 : 공개
? : 미개봉
숫자 : 주변 지뢰 수
* : 폭탐

1 1 1 0 ?
1 ? 2 1 ?
1 2 ? 1 ?
0 1 1 1 ?
0 ? 0 ? ?

*/

package solve_original.solve_interview.ch07;