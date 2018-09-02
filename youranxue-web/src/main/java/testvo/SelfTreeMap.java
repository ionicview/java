package testvo;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SelfTreeMap {
	private Integer value;
	private String name;
	private String path;
	private List<SelfTreeMap> children;

	public static void main(String[] args) {

		SelfTreeMap foo = SelfTreeMap.builder().name("name").value(40).path("Accessibility").build();

		SelfTreeMap sub1 = SelfTreeMap.builder().name("namesub1").value(2).path("Accessibilitysub1").build();
		SelfTreeMap sub3 = SelfTreeMap.builder().name("namesub3").value(3).path("Accessibilitysub3").build();
		SelfTreeMap sub4 = SelfTreeMap.builder().name("namesub4").value(4).path("Accessibilitysub4").build();
		sub1.setChildren(Lists.newArrayList(sub3, sub4));

		SelfTreeMap sub2 = SelfTreeMap.builder().name("namesub2").value(33).path("Accessibilitysub2").build();

		foo.setChildren(Lists.newArrayList(sub1, sub2));
		
		// serializes
		String json = JSON.toJSONString(foo);
		System.out.println(json);
		// VO vo = JSON.parseObject("{...}", VO.class); //反序列化
	}
}
