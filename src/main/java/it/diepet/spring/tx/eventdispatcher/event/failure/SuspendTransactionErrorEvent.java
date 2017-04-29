package it.diepet.spring.tx.eventdispatcher.event.failure;

import it.diepet.spring.tx.eventdispatcher.model.SuspendTransactionInfo;

/**
 * The Class SuspendTransactionErrorEvent.
 */
public class SuspendTransactionErrorEvent extends TransactionErrorEvent<SuspendTransactionInfo> {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2747252413803660635L;

	/**
	 * Instantiates a new suspend transaction error event.
	 *
	 * @param suspendTransactionInfo
	 *            the suspend transaction info
	 * @param error
	 *            the error
	 */
	public SuspendTransactionErrorEvent(SuspendTransactionInfo suspendTransactionInfo, RuntimeException error) {
		super(suspendTransactionInfo, error);
	}

}
