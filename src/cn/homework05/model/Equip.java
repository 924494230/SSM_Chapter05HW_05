package cn.homework05.model;

/**
 * 装备实体类
 * 
 * @author 北大青鸟
 * 
 */
public class Equip {

	private String name;// 装备名称
	private String type;// 装备类型，头盔、铠甲等
	private Long speedPlus;// 速度增效
	private Long attackPlus;// 攻击增效
	private Long defencePlus;// 防御增效

	public String toString() {
		return this.name + "[" + this.type + "：速度+" + this.speedPlus + ",攻击+"
				+ this.attackPlus + ",防御+" + this.defencePlus + "]";
	}

	public Long getAttackPlus() {
		return attackPlus;
	}

	public void setAttackPlus(Long attackPlus) {
		this.attackPlus = attackPlus;
	}

	public Long getDefencePlus() {
		return defencePlus;
	}

	public void setDefencePlus(Long defencePlus) {
		this.defencePlus = defencePlus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSpeedPlus() {
		return speedPlus;
	}

	public void setSpeedPlus(Long speedPlus) {
		this.speedPlus = speedPlus;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
