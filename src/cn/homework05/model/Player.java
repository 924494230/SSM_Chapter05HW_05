package cn.homework05.model;

/**
 * 玩家 实体类
 * 
 * @author 北大青鸟
 * 
 */
public class Player {

	private Equip armet;// 头盔
	private Equip loricae;// 铠甲
	private Equip boot;// 靴子
	private Equip ring;// 指环

	public Long getSpeedPlus() {
		return this.armet.getSpeedPlus() + this.loricae.getSpeedPlus()
				+ this.boot.getSpeedPlus() + this.ring.getSpeedPlus();
	}

	public Long getAttackPlus() {
		return this.armet.getAttackPlus() + this.loricae.getAttackPlus()
				+ this.boot.getAttackPlus() + this.ring.getAttackPlus();
	}

	public Long getDefencePlus() {
		return this.armet.getDefencePlus() + this.loricae.getDefencePlus()
				+ this.boot.getDefencePlus() + this.ring.getDefencePlus();
	}

	// 升级装备
	public void updateEquip(Equip equip) {
		if ("头盔".equals(equip.getType())) {
			System.out.println("头盔升级为" + equip.getName());
			this.armet = equip;
		}
		if ("铠甲".equals(equip.getType())) {
			System.out.println("铠甲升级为" + equip.getName());
			this.loricae = equip;
		}
		if ("靴子".equals(equip.getType())) {
			System.out.println("靴子升级为" + equip.getName());
			this.boot = equip;
		}
		if ("指环".equals(equip.getType())) {
			System.out.println("指环升级为" + equip.getName());
			this.ring = equip;
		}
	}

	public Equip getArmet() {
		return armet;
	}

	public void setArmet(Equip armet) {
		this.armet = armet;
	}

	public Equip getBoot() {
		return boot;
	}

	public void setBoot(Equip boot) {
		this.boot = boot;
	}

	public Equip getLoricae() {
		return loricae;
	}

	public void setLoricae(Equip loricae) {
		this.loricae = loricae;
	}

	public Equip getRing() {
		return ring;
	}

	public void setRing(Equip ring) {
		this.ring = ring;
	}

}
