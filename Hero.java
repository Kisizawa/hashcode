import java.util.Objects;


public class Hero {
	String name;
	int hp;
	
	@Override
	public int hashCode() {
		return Objects.hash(this.hp, this.name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hero other = (Hero) obj;
		return hp == other.hp && Objects.equals(name, other.name);
	}
}
