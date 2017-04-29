package it.diepet.spring.tx.eventdispatcher.event.failure;

import it.diepet.spring.tx.eventdispatcher.model.SetRollbackOnlyTransactionInfo;

/**
 * The Class SetRollbackOnlyTransactionErrorEvent.
 */
public class SetRollbackOnlyTransactionErrorEvent extends TransactionErrorEvent<SetRollbackOnlyTransactionInfo> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -9214810245384000054L;

	/**
	 * Instantiates a new sets the rollback only transaction error event.
	 *
	 * @param setRollbackOnlyTransactionInfo
	 *            the set rollback only transaction info
	 * @param error
	 *            the error
	 */
	public SetRollbackOnlyTransactionErrorEvent(SetRollbackOnlyTransactionInfo setRollbackOnlyTransactionInfo,
			RuntimeException error) {
		super(setRollbackOnlyTransactionInfo, error);
	}

}
