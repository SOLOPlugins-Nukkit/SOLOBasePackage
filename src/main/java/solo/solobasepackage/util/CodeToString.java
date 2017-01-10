package solo.solobasepackage.util;

import java.util.HashMap;

public class CodeToString {

	private CodeToString(){
		
	}
	
	public static String item(int code){
		return item(code, 0);
	}

	public static String item(int code, int damage){
		String key = Integer.toString(code) + ":" + Integer.toString(damage);
		if(itemcode.containsKey(key)){
			return itemcode.get(key);
		}
		return "Unknown";
	}
	
	@SuppressWarnings("serial")
	public static final HashMap<String, String> itemcode = new HashMap<String, String>(){{
		put("0:0", "공기");
		put("1:0", "돌");
		put("1:1", "화강암");
		put("1:2", "부드러운 화강암");
		put("1:3", "섬록암");
		put("1:4", "부드러운 섬록암");
		put("1:5", "안산암");
		put("1:6", "부드러운 안산암");
		put("2:0", "잔디");
		put("3:0", "흙");
		put("4:0", "조약돌");
		put("5:0", "참나무 목재");
		put("5:1", "가문비 나무 목재");
		put("5:2", "자작 나무 목재");
		put("5:3", "정글 나무 목재");
		put("5:4", "아카시아 나무 목재");
		put("5:5", "짙은 참나무 목재");
		put("6:0", "참나무 묘목");
		put("6:1", "가문비 나무 묘목");
		put("6:2", "자작 나무 묘목");
		put("6:3", "정글 나무 묘목");
		put("6:4", "아카시아 나무 묘목");
		put("6:5", "짙은 참나무 묘목");
		put("7:0", "기반암");
		put("8:0", "물");
		put("9:0", "멈춘 물");
		put("10:0", "용암");
		put("11:0", "멈춘 용암");
		put("12:0", "모래");
		put("12:1", "붉은 모래");
		put("13:0", "자갈");
		put("14:0", "금광석");
		put("15:0", "철광석");
		put("16:0", "석탄광석");
		put("17:0", "참나무");
		put("17:1", "가문비나무");
		put("17:2", "자작나무");
		put("17:3", "정글나무");
		put("18:0", "참나무 잎");
		put("18:1", "가문비나무 잎");
		put("18:2", "자작나무 잎");
		put("18:3", "정글나무 잎");
		put("19:0", "스펀지");
		put("19:1", "젖은 스펀지");
		put("20:0", "유리");
		put("21:0", "청금석 원석");
		put("22:0", "청금석 블럭");
		put("23:0", "발사기");
		put("24:0", "사암");
		put("24:1", "조각된 사암");
		put("24:2", "부드러운 사암");
		put("25:0", "노트 블럭");
		put("26:0", "침대 (블럭)");
		put("27:0", "파워 레일");
		put("28:0", "디텍터 레일");
		put("29:0", "끈끈이 피스톤");
		put("30:0", "거미줄");
		put("31:0", "덤불");
		put("31:1", "잔디");
		put("31:2", "고사리");
		put("32:0" , "마른 덤불");
		put("33:0", "피스톤");
		put("34:0", "피스톤 (머리)");
		put("35:0", "흰색 양털");
		put("35:1", "주황색 양털");
		put("35:2", "자홍색 양털");
		put("35:3", "하늘색 양털");
		put("35:4", "노랑색 양털");
		put("35:5", "연두색 양털");
		put("35:6", "분홍색 양털");
		put("35:7", "회색 양털");
		put("35:8", "밝은 회색 양털");
		put("35:9", "청록색 양털");
		put("35:10", "보라색 양털");
		put("35:11", "파랑색 양털");
		put("35:12", "갈색 양털");
		put("35:13", "초록색 양털");
		put("35:14", "빨간색 양털");
		put("35:15", "검은색 양털");
	
		put("37:0", "민들레");
		put("38:0", "양귀비 ");
		put("38:1", "파란 난초");
		put("38:2", "파꽃");
		put("38:3", "푸른 삼백초");
		put("38:4", "빨간색 튤립");
		put("38:5", "주황색 튤립");
		put("38:6", "흰색 튤립");
		put("38:7", "분홍색 튤립");
		put("38:8", "데이지");
		put("39:0", "갈색 버섯");
		put("40:0", "빨간 버섯");
		put("41:0", "금 블럭");
		put("42:0", "철 블럭");
		put("43:0", "돌 반블럭 (더블)");
		put("43:1", "사암 반블럭 (더블)");
		put("43:2", "목재 반블럭 (더블)");
		put("43:3", "조약돌 반블럭 (더블)");
		put("43:4", "벽돌 반블럭(더블)");
		put("43:5", "석재 반블럭 (더블)");
		put("43:6", "석영 반블럭 (더블)");
		put("43:7", "네더벽돌 반블럭 (더블)");
		put("43:8", "돌 반블럭 (더블)");
		put("43:9", "부드러운 사암 반블럭 (더블)");
		put("43:10", "참나무 목재 반블럭 (더블)");
		put("44:0", "돌 반블럭");
		put("44:1", "사암 반블럭");
		put("44:2", "참나무 반블럭");
		put("44:3", "조약돌 반블럭");
		put("44:4", "벽돌 반블럭");
		put("44:5", "석재 반블럭");
		put("44:6", "석영 반블럭");
		put("44:7", "네더벽돌 반블럭");
		put("45:0", "벽돌");
		put("46:0", "TNT");
		put("47:0", "책장");
		put("48:0", "이끼 낀 돌");
		put("49:0", "흑요석");
		put("50:0", "횃불");
		put("51:0", "불");
		put("52:0", "몬스터 스포너");
		put("53:0", "참나무 계단");
		put("54:0", "상자");
		put("55:0", "레드스톤 가루");
		put("56:0", "다이아몬드 원석");
		put("57:0", "다이아몬드 블럭");
		put("58:0", "작업대");
		put("59:0", "밀 (작물)");
		put("60:0", "농토");
		put("61:0", "화로");
		put("62:0", "타고있는 화로");
		put("63:0", "표지판 (블럭)");
		put("64:0", "나무문 (블럭)");
		put("65:0", "사다리");
		put("66:0", "레일");
		put("67:0", "조약돌 계단");
		put("68:0", "벽 표지판 (블럭)");
		put("69:0", "레버 (블럭)");
		put("70:0", "돌 감압판");
		put("71:0", "철 문 (블럭)");
		put("72:0", "나무 감압판");
		put("73:0", "레드스톤 광석");
		put("74:0", "빛나는 레드스톤 광석");
		put("75:0", "꺼진 레드스톤 횃불 (블럭)");
		put("76:0", "레드스톤 횃불 (블럭)");
		put("77:0", "돌 버튼");
		put("78:0", "눈");
		put("79:0", "얼음");
		put("80:0", "눈 블럭");
		put("81:0", "선인장");
		put("82:0", "점토 블럭");
		put("83:0", "사탕수수 (블럭)");
	
		put("85:0", "울타리");
		put("85:1", "가문비나무 울타리");
		put("85:2", "자작나무 울타리");
		put("85:3", "정글 나무 울타리");
		put("85:4", "아카시아 나무 울타리");
		put("85:5", "짙은 참나무 울타리");
		put("86:0", "호박");
		put("87:0", "네더랙");
		put("88:0", "소울 샌드");
		put("89:0", "발광석");
		put("90:0", "포탈");
		put("91:0", "잭 오 랜턴");
		put("92:0", "케이크 (블럭)");
		put("93:0", "꺼진 레드스톤 중계기 (블럭)");
		put("94:0", "켜진 레드스톤 중계기 (블럭)");
		put("95:0", "보이지 않는 베드락");
		put("96:0", "다락문");
		put("97:0", "몬스터 에그 돌");
		put("97:1", "몬스터 에그 조약돌");
		put("97:2", "몬스터 에그 석재벽돌");
		put("97:3", "몬스터 에그 이끼낀 석재벽돌");
		put("97:4", "몬스터 에그 깨진 석재벽돌");
		put("97:5", "몬스터 에그 조각된 석재벽돌");
		put("98:0", "석재 벽돌");
		put("98:1", "이끼 낀 석재 벽돌");
		put("98:2", "깨진 석재 벽돌");
		put("98:3", "조각된 석재벽돌");
		put("99:0", "갈색 버섯 (블럭)");
		put("100:0", "빨간색 버섯 (블럭)");
		put("101:0", "철창");
		put("102:0", "유리판");
		put("103:0", "수박 (블럭)");
		put("104:0", "호박 줄기");
		put("105:0", "수박 줄기");
		put("106:0", "덩굴");
		put("107:0", "울타리 문");
		put("108:0", "벽돌 계단");
		put("109:0", "석재 벽돌 계단");
		put("110:0", "균사체");
		put("111:0", "연꽃잎");
		put("112:0", "네더 벽돌 블럭");
		put("113:0", "네더 벽돌 울타리");
		put("114:0", "네더 벽돌 계단");
		put("115:0", "네더 와트 (블럭)");
		put("116:0", "마법부여대");
		put("117:0", "양조기 (블럭)");
		put("118:0", "가마솥 (블럭)");
	
		put("120:0", "엔더 포탈 프레임");
		put("121:0", "엔드 스톤");
	
		put("123:0", "레드스톤 조명");
		put("124:0", "켜진 레드스톤 조명");
		put("125:0", "공급기");
		put("126:0", "활성화 레일");
		put("127:0", "코코아 콩 (블럭)");
		put("128:0", "사암 계단");
		put("129:0", "에메랄드 원석");
	
		put("131:0", "철사덫 갈고리");
		put("132:0", "철사덫");
		put("133:0", "에메랄드 블럭");
		put("134:0", "가문비나무 계단");
		put("135:0", "자작나무 계단");
		put("136:0", "정글 나무 계단");
	
		put("138:0", "비콘");
		put("139:0", "조약돌 담장");
		put("139:1", "이끼 낀 돌 담장");
		put("140:0", "화분 (블럭)");
		put("141:0", "당근 (블럭)");
		put("142:0", "감자 (블럭)");
		put("143:0", "나무 버튼");
		put("144:0", "스켈레톤 머리");
		put("144:1", "위더 스켈레톤 머리");
		put("144:2", "좀비 머리");
		put("144:3", "스티브 머리");
		put("144:4", "크리퍼 머리");
		put("145:0", "모루");
		put("145:1", "약간 손상된 모루");
		put("145:2", "심각하게 손상된 모루");
		put("146:0", "덫 상자");
		put("147:0", "무게 감압판 (경형)");
		put("148:0", "무게 감압판 (중형)");
		put("149:0", "꺼진 레드스톤 비교기");
		put("150:0", "켜진 레드스톤 비교기");
		put("151:0", "햇빛 감지기");
		put("152:0", "레드스톤 블럭");
		put("153:0", "네더 석영 원석");
		put("154:0", "깔대기");
		put("155:0", "석영 블럭");
		put("155:1", "조각된 석영 블럭");
		put("155:2", "석영 기둥");
		put("156:0", "석영 계단");
		put("157:0", "참나무 목재 (더블)");
		put("157:1", "가문비나무 목재 (더블)");
		put("157:2", "자작나무 목재 (더블)");
		put("157:3", "정글 나무 목재 (더블)");
		put("157:4", "아카시아 나무 목재 (더블)");
		put("157:5", "짙은 참나무 목재 (더블)");
		put("158:0", "참나무 목재 반블럭");
		put("158:1", "가문비나무 목재 반블럭");
		put("158:2", "자작나무 목재 반블럭");
		put("158:3", "정글 나무 목재 반블럭");
		put("158:4", "아카시아 나무 목재 반블럭");
		put("158:5", "짙은참 나무 목재 반블럭");
		put("159:0", "하얀색 염색된 점토");
		put("159:1", "주황색 염색된 점토");
		put("159:2", "자홍색 염색된 점토");
		put("159:3", "하늘색 염색된 점토");
		put("159:4", "노랑색 염색된 점토");
		put("159:5", "연두색 염색된 점토");
		put("159:6", "분홍색 염색된 점토");
		put("159:7", "회색 염색된 점토");
		put("159:8", "밝은 회색 염색된 점토");
		put("159:9", "청록색 염색된 점토");
		put("159:10", "보라색 염색된 점토");
		put("159:11", "파랑색 염색된 점토");
		put("159:12", "갈색 염색된 점토");
		put("159:13", "초록색 염색된 점토");
		put("159:14", "빨간색 염색된 점토");
		put("159:15", "검은색 염색된 점토");
	
		put("161:0", "아카시아 나무 잎");
		put("161:1", "짙은 참나무 잎");
		put("162:0", "아카시아 나무");
		put("162:1", "짙은 참나무");
		put("163:0", "아카시아 나무 계단");
		put("164:0", "짙은 참나무 계단");
		put("165:0", "슬라임 블럭");
	
		put("167:0", "철 다락문");
		put("168:0", "프리즈마린");
		put("169:0", "바다 등");
		put("170:0", "건초 더미");
		put("171:0", "흰색 카펫");
		put("171:1", "주황색 카펫");
		put("171:2", "자홍색 카펫");
		put("171:3", "하늘색 카펫");
		put("171:4", "노랑색 카펫");
		put("171:5", "연두색 카펫");
		put("171:6", "분홍색 카펫");
		put("171:7", "회색 카펫");
		put("171:8", "밝은 회색 카펫");
		put("171:9", "청록색 카펫");
		put("171:10", "보라색 카펫");
		put("171:11", "파랑색 카펫");
		put("171:12", "갈색 카펫");
		put("171:13", "초록색 카펫");
		put("171:14", "빨간색 카펫");
		put("171:15", "검은색 카펫");
		put("172:0", "굳은 점토");
		put("173:0", "석탄 블럭");
		put("174:0", "단단한 얼음");
		put("175:0", "해바라기");
		put("175:1", "라일락");
		put("175:2", "큰 잔디");
		put("175:3", "큰 고사리");
		put("175:4", "장미덩쿨");
		put("175:5", "모란");
	
		put("178:0", "햇빛 감지기");
		put("179:0", "붉은 사암");
		put("180:0", "붉은 사암 계단");
		put("181:0", "붉은 사암 반블럭 (더블)");
		put("182:0", "붉은 사암 반블럭");
		put("183:0", "가문비나무 울타리 문");
		put("184:0", "자작나무 울타리 문");
		put("185:0", "정글 나무 울타리 문");
		put("186:0", "짙은 참나무 울타리 문");
		put("187:0", "아카시아 나무 울타리 문");
	
		put("193:0", "가문비나무 문");
		put("194:0", "자작나무 문");
		put("195:0", "정글 나무 문");
		put("196:0", "아카시아 문");
		put("197:0", "짙은참나무 문");
		put("198:0", "잔디길");
		put("199:0", "아이템 액자 블럭");
	
		put("243:0", "회백토");
		put("244:0", "사탕무 줄기");
		put("245:0", "돌 절단기");
		put("246:0", "빛나는 흑요석");
		put("247:0", "네더 코어");
		put("247:1", "빛나는 네더 코어");
		put("247:2", "꺼진 네더 코어");
		put("248:0", "업데이트 블럭");
		put("249:0", "업데이트 블럭");
		put("250:0", "피스톤에 의해 움직여진 블럭");
		put("251:0", "관찰자 블럭");
	
	
	
		put("256:0", "철 삽");
		put("257:0", "철 곡괭이");
		put("258:0", "철 도끼");
		put("259:0", "라이터");
		put("260:0", "사과");
		put("261:0", "활");
		put("262:0", "화살");
		put("262:1", "뽀족한 화살(효과없음)");
		put("262:2", "뾰족한 화살(효과없음)");
		put("262:3", "뾰족한 화살(효과없음)");
		put("262:4", "뾰족한 화살(효과없음)");
		put("262:5", "뾰족한 화살(효과없음)");
		put("262:6", "야간 투시 화살 (야간 투시 (0:22))");
		put("262:7", "야간 투시 화살 (야간 투시 (1:00))");
		put("262:8", "투명 화살 (투명화 (0:22))");
		put("262:9", "투명 화살 (투명화 (1:00))");
		put("262:10", "도약 화살 (점프 강화 (0:22))");
		put("262:11", "도약 화살 (점프 강화 (1:00))");
		put("262:12", "도약 화살 (점프 강화 II (0:11)");
		put("262:13", "화염 저항 화살 (화염 저항 (0:22))");
		put("262:14", "화염 저항 화살 (화염 저항 (1:00))");
		put("262:15", "민첩의 화살 (신속 (0:22))");
		put("262:16", "민첩의 화살 (신속 (1:00))");
		put("262:17", "민첩의 화살 (신속 II (0:11))");
		put("262:18", "느림의 화살 (구속 (0:11))");
		put("262:19", "느림의 화살 (구속 (0:30))");
		put("262:20", "수중 호흡 화살 (수중 호흡 (0:22))");
		put("262:21", "수중 호흡 화살 (수중 호흡 (1:00))");
		put("262:22", "치유 화살 (즉시 회복)");
		put("262:23", "치유 화살 (즉시 회복 II)");
		put("262:24", "고통의 화살 (즉시 피해)");
		put("262:25", "고통의 화살 (즉시 피해 II)");
		put("262:26", "독화살 (독 (0:05))");
		put("262:27", "독화살 (독 (0:15))");
		put("262:28", "독화살 (독 II (0:02))");
		put("262:29", "재생의 화살 (재생 (0:05))");
		put("262:30", "재생의 화살 (재생 (0:15))");
		put("262:31", "재생의 화살 (재생 II (0:02))");
		put("262:32", "힘의 화살 (힘 (0:22))");
		put("262:33", "힘의 화살 (힘 (1:00))");
		put("262:34", "힘의 화살 (힘 II (0:11))");
		put("262:35", "약화의 화살 (나약함 (0:11))");
		put("262:36", "약화의 화살 (나약함 (0:30))");
		put("263:0", "석탄");
		put("263:1", "목탄");
		put("264:0", "다이아몬드");
		put("265:0", "철괴");
		put("266:0", "금괴");
		put("267:0", "철 칼");
		put("268:0", "나무 칼");
		put("269:0", "나무 삽");
		put("270:0", "나무 곡괭이");
		put("271:0", "나무 도끼");
		put("272:0", "돌 칼");
		put("273:0", "돌 삽");
		put("274:0", "돌 곡괭이");
		put("275:0", "돌도끼");
		put("276:0", "다이아몬드 칼");
		put("277:0", "다아아몬드 삽");
		put("278:0", "다이아몬드 곡괭이");
		put("279:0", "다이아몬드 도끼");
		put("280:0", "막대기");
		put("281:0", "그릇");
		put("282:0", "버섯 스튜");
		put("283:0", "금 칼");
		put("284:0", "금 삽");
		put("285:0", "금 곡괭이");
		put("286:0", "금 도끼");
		put("287:0", "실");
		put("288:0", "깃털");
		put("289:0", "화약");
		put("290:0", "나무 괭이");
		put("291:0", "돌 괭이");
		put("292:0", "철 괭이");
		put("293:0", "다이아몬드 괭이");
		put("294:0", "금 괭이");
		put("295:0", "씨앗");
		put("296:0", "밀");
		put("297:0", "빵");
		put("298:0", "가죽 모자");
		put("299:0", "가죽 튜닉");
		put("300:0", "가죽 바지");
		put("301:0", "가죽 신발");
		put("302:0", "사슬 투구");
		put("303:0", "사슬 갑옷");
		put("304:0", "사슬 레깅스");
		put("305:0", "사슬 부츠");
		put("306:0", "철 투구");
		put("307:0", "철 갑옷");
		put("308:0", "철 레깅스");
		put("309:0", "철 부츠");
		put("310:0", "다이아몬드 투구");
		put("311:0", "다이아몬드 갑옷");
		put("312:0", "다이아몬드 레깅스");
		put("313:0", "다이아몬드 부츠");
		put("314:0", "금 투구");
		put("315:0", "금 갑옷");
		put("316:0", "금 레깅스");
		put("317:0", "금 부츠");
		put("318:0", "부싯돌");
		put("319:0", "익히지 않은 돼지고기");
		put("320:0", "구운 돼지고기");
		put("321:0", "그림");
		put("322:0", "황금 사과");
		put("323:0", "표지판");
		put("324:0", "나무 문");
		put("325:0", "양동이");
		put("325:1", "우유 양동이");
		put("325:8", "물 양동이");
		put("325:10", "용암 양동이");
	
		put("328:0", "마인카트");
		put("329:0", "안장");
		put("330:0", "철문");
		put("331:0", "레드스톤");
		put("332:0", "눈덩이");
		put("333:0", "보트");
		put("334:0", "가죽");
	
		put("336:0", "점토 벽돌");
		put("337:0", "점토");
		put("338:0", "사탕수수");
		put("339:0", "종이");
		put("340:0", "책");
		put("341:0", "슬라임볼");
		put("342:0", "상자 광물 수레");
	
		put("344:0", "달걀");
		put("345:0", "나침판");
		put("346:0", "낚시대");
		put("347:0", "시계");
		put("348:0", "발광석 가루");
		put("349:0", "날 생선");
		put("349:1", "날 연어");
		put("349:2", "흰둥가리");
		put("349:3", "복어");
		put("350:0", "익힌 생선");
		put("350:1", "익힌 연어");
		put("351:0", "먹물");
		put("351:1", "빨간 장미 염료");
		put("351:2", "초록 선인장 염료");
		put("351:3", "코코아 콩");
		put("351:4", "청금석");
		put("351:5", "보라색 염료");
		put("351:6", "청록색 염료");
		put("351:7", "밝은 회색 염료");
		put("351:8", "회색 염료");
		put("351:9", "분홍색 염료");
		put("351:10", "연두색 염료");
		put("351:11", "민들레 노랑 염료");
		put("351:12", "하늘색 염료");
		put("351:13", "자홍색 염료");
		put("351:14", "주황색 염료");
		put("351:15", "뼛가루");
		put("352:0", "뼈");
		put("353:0", "설탕");
		put("354:0", "케이크");
		put("355:0", "침대");
		put("356:0", "레드스톤 중계기");
		put("357:0", "쿠키");
		put("359:0", "가위");
		put("360:0", "수박");
		put("361:0", "호박 씨");
		put("362:0", "수박 씨");
		put("363:0", "익히지 않은 소고기");
		put("364:0", "스테이크");
		put("365:0", "익히지 않은 닭고기");
		put("366:0", "구운 닭고기");
		put("367:0", "썩은 고기");
	
		put("369:0", "블레이즈 막대");
		put("370:0", "가스트의 눈물");
		put("371:0", "금 조각");
		put("372:0", "네더 와트");
		put("373:0", "물병");
		put("373:1", "평범한 포션 (효과 없음)");
		put("373:2", "평범한 포션 (효과 없음)");
		put("373:3", "진한 포션 (효과 없음)");
		put("373:4", "이상한 포션 (효과 없음)");
		put("373:5", "야간 투시 포션 (야간 투시 (3:00))");
		put("373:6", "야간 투시 포션 (야간 투시 (8:00))");
		put("373:7", "투명화 포션 (투명화 (3:00))");
		put("373:8", "투명화 포션 (투명화 (8:00))");
		put("373:9", "도약의 포션 (점프 강화 (3:00))");
		put("373:10", "도약의 포션 (점프 강화 (8:00))");
		put("373:11", "도약의 포션 (점프 강화 II (1:30))");
		put("373:12", "화염 저항 포션 (화염 저항 (3:00))");
		put("373:13", "화염 저항 포션 (화염 저항 (8:00))");
		put("373:14", "신속의 포션 (신속 (3:00))");
		put("373:15", "신속의 포션 (신속 (8:00))");
		put("373:16", "신속의 포션 (신속 II (1:30))");
		put("373:17", "구속의 포션 (구속 (1:30))");
		put("373:18", "구속의 포션 (구속 (4:00))");
		put("373:19", "수중 호흡 포션 (수중 호흡 (3:00))");
		put("373:20", "수중 호흡 포션 (수중 호흡 (8:00))");
		put("373:21", "회복 포션 (즉시 회복)");
		put("373:22", "회복 포션 (즉시 회복 II)");
		put("373:23", "고통의 포션 (즉시 피해)");
		put("373:24", "고통의 포션 (즉시 피해 II)");
		put("373:25", "독 포션 (독 (0:45))");
		put("373:26", "독 포션 (독 (2:00))");
		put("373:27", "독 포션 (독 II (0:22))");
		put("373:28", "재생 포션 (재생 (0:45))");
		put("373:29", "재생 포션 (재생 (2:00))");
		put("373:30", "재생 포션 (재생 II (0:22))");
		put("373:31", "힘의 포션 (힘 (3:00))");
		put("373:32", "힘의 포션 (힘 (8:00))");
		put("373:33", "힘의 포션 (힘 II (1:30))");
		put("373:34", "나약의 포션 (나약함 (1:30))");
		put("373:35", "나약의 포션 (나약함 (4:00))");
		put("374:0", "유리병");
		put("375:0", "거미 눈");
		put("376:0", "발효된 거미 눈");
		put("377:0", "블레이즈 가루");
		put("378:0", "마그마 크림");
		put("379:0", "양조기");
		put("380:0", "가마솥");
	
		put("382:0", "반짝이는 수박");
		put("383:0", "스폰알");
		put("383:10", "닭 스폰알");
		put("383:11", "소 스폰알");
		put("383:12", "돼지 스폰알");
		put("383:13", "양 스폰알");
		put("383:14", "늑대 스폰알");
		put("383:15", "주민 스폰알");
		put("383:16", "버섯소 스폰알");
		put("383:17", "오징어 스폰알");
		put("383:19", "박쥐 스폰알");
		put("383:22", "오셀롯 스폰알");
		put("383:33", "좀비 스폰알");
		put("383:34", "스켈레톤 스폰알");
		put("383:35", "거미 스폰알");
		put("383:36", "돼지좀비 스폰알");
		put("383:37", "슬라임 스폰알");
		put("383:38", "엔더맨 스폰알");
		put("383:39", "실버피쉬 스폰알");
		put("383:40", "동굴거미 스폰알");
		put("383:41", "가스트 스폰알");
		put("383:42", "마그마 큐브 스폰알");
		put("383:43", "블레이즈 스폰알");
		put("384:0", "경험치 병");
	
		put("388:0", "에메랄드");
		put("389:0", "아이템 액자");
		put("390:0", "화분");
		put("391:0", "당근");
		put("392:0", "감자");
		put("393:0", "구운 감자");
		put("394:0", "독이 있는 감자");
		put("395:0", "빈 지도");
		put("396:0", "황금 당근");
		put("397:0", "스켈레톤 머리");
		put("397:1", "위더스켈레톤 머리");
		put("397:2", "좀비 머리");
		put("397:3", "머리");
		put("397:4", "크리퍼 머리");
		put("398:0", "당근 낚싯대");
		put("399:0", "네더의 별");
		put("400:0", "호박파이");
	
		put("403:0", "마법부여된 책");
		put("404:0", "레드스톤 비교기");
		put("405:0", "네더 벽돌");
		put("406:0", "석영");
		put("407:0", "TNT 광물 수레");
		put("408:0", "깔때기 광물 수레");
		put("409:0", "프리즈마린 조각");
		put("410:0", "깔때기");
		put("411:0", "익히지 않은 토끼고기");
		put("412:0", "구운 토끼고기");
		put("413:0", "토끼 스튜");
		put("414:0", "토끼 발");
		put("415:0", "토끼 가죽");
		put("416:0", "가죽 말 갑옷");
		put("417:0", "철 말 갑옷");
		put("418:0", "금 말 갑옷");
		put("419:0", "다이아몬드 말 갑옷");
		put("420:0", "목줄");
		put("421:0", "이름표");
		put("422:0", "프리즈마린 수정");
		put("423:0", "익히지 않은 양고기");
		put("424:0", "구운 양고기");
	
		put("427:0", "가문비나무 문");
		put("428:0", "자작나무 문");
		put("429:0", "정글 나무 문");
		put("430:0", "아카시아 나무 문");
		put("431:0", "짙은 참나무 문");
	
		put("438:0", "투척용 포션");
		put("438:1", "투척용 평범한 포션");
		put("438:2", "투척용 평범한 포션");
		put("438:3", "투척용 진한 포션");
		put("438:4", "투척용 이상한 포션");
		put("438:5", "투척용 야간 투시 포션 (야간 투시 (2:15))");
		put("438:6", "투척용 야간 투시 포션 (야간 투시 (6:00))");
		put("438:7", "투척용 투명화 포션 (투명화 (2:15))");
		put("438:8", "투척용 투명화 포션 (투명화 (6:00))");
		put("438:9", "투척용 도약의 포션 (점프 강화 (2:15))");
		put("438:10", "투척용 도약의 포션 (점프 강화 (6:00))");
		put("438:11", "투척용 도약의 포션 (점프 강화 II (1:07))");
		put("438:12", "투척용 화염 저항 포션 (화염 저항 (2:15))");
		put("438:13", "투척용 화염 저항 포션 (화염 저항 (6:00))");
		put("438:14", "투척용 신속의 포션 (신속 (2:15))");
		put("438:15", "투척용 신속의 포션 (신속 (6:00))");
		put("438:16", "투척용 신속의 포션 (신속 II (1:07))");
		put("438:17", "투척용 구속의 포션 (구속 (1:07))");
		put("438:18", "투척용 구속의 포션 (구속 (3:00))");
		put("438:19", "투척용 수중 호흡 포션 (수중 호흡 (2:15))");
		put("438:20", "투척용 수중 호흡 포션 (수중 호흡 (6:00))");
		put("438:21", "투척용 회복 포션 (즉시 회복)");
		put("438:22", "투척용 회복 포션 (즉시 회복 II)");
		put("438:23", "투척용 고통의 포션 (즉시 피해)");
		put("438:24", "투척용 고통의 포션 (즉시 피해 II)");
		put("438:25", "투척용 독 포션 (독 (0:33))");
		put("438:26", "투척용 독 포션 (독 (1:30))");
		put("438:27", "투척용 독 포션 (독 II (0:16))");
		put("438:28", "투척용 재생 포션 (재생 (0:33))");
		put("438:29", "투척용 재생 포션 (재생 (1:30))");
		put("438:30", "투척용 재생 포션 (재생 II (0:16))");
		put("438:31", "투척용 힘의 포션 (힘 (2:15))");
		put("438:32", "투척용 힘의 포션 (힘 (6:00))");
		put("438:33", "투척용 힘의 포션 (힘 II (1:07))");
		put("438:34", "투척용 냐약의 포션 (1:07))");
		put("438:35", "투척용 나약의 포션 (3:00))");
	
		put("444:0", "가문비나무 보트");
		put("445:0", "자작나무 보트");
		put("446:0", "정글 나무 보트");
		put("447:0", "아카시아 나무 보트");
		put("448:0", "짙은 참나무 보트");
	
		put("457:0", "사탕무");
		put("458:0", "사탕무 씨앗");
		put("459:0", "사탕무 수프");
		put("460:0", "날 연어");
		put("461:0", "흰동가리");
		put("462:0", "복어");
		put("463:0", "익힌 연어");
	
		put("466:0", "황금 사과");
	
		put("498:0", "카메라");
	}};
	
}