package br.com.cod3r.template.persist.model;

public abstract class ModelPersist {

	public final ModelPersist save() {
		preSave();
		prePersist();
		System.out.println(String.format("Saving %s in database", this.getClass().getSimpleName()));
		postSave();
		return this;
	}

	public final ModelPersist update() {
		preUpdate();
		prePersist();
		System.out.println(String.format("Updating %s in database", this.getClass().getSimpleName()));
		postUpdate();
		return this;

	}

	public final void delete() {
		preDelete();
		prePersist();
		System.out.println(String.format("Deleting %s in database", this.getClass().getSimpleName()));
		postDelete();
	}

	protected abstract void preSave();

	protected void preUpdate() {
	}

	protected void preDelete() {
	}

	protected void postSave() {
	}

	protected void postUpdate() {
	}

	protected void postDelete() {
	}

	protected void prePersist() {
	}
}
