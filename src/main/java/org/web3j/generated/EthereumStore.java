package org.web3j.generated;

import io.reactivex.Flowable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Bool;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Bytes32;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.0.1.
 */
public class EthereumStore extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50604051602080611a72833981016040525160008054600160a060020a03909216600160a060020a0319909216919091179055611a20806100526000396000f3006080604052600436106100825763ffffffff7c0100000000000000000000000000000000000000000000000000000000600035041663200ab0d381146100875780634ad24bec146100b157806366eb1c92146100dd578063927a32e31461013d578063aba3093f1461016e578063c7c2e5f414610243578063e7a27c421461025b575b600080fd5b34801561009357600080fd5b5061009f600435610273565b60408051918252519081900360200190f35b3480156100bd57600080fd5b506100c9600435610292565b604080519115158252519081900360200190f35b3480156100e957600080fd5b5060408051602060046024803582810135601f810185900485028601850190965285855261013b9583359536956044949193909101919081908401838280828437509497506102a79650505050505050565b005b34801561014957600080fd5b50610155600435610547565b6040805192835260208301919091528051918290030190f35b34801561017a57600080fd5b50604080516020600460443581810135601f81018490048402850184019095528484526101ce9482359460248035953695946064949201919081908401838280828437509497506105609650505050505050565b6040805160208082528351818301528351919283929083019185019080838360005b838110156102085781810151838201526020016101f0565b50505050905090810190601f1680156102355780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b34801561024f57600080fd5b506100c96004356106bb565b34801561026757600080fd5b506100c96004356106d0565b600180548290811061028157fe5b600091825260209091200154905081565b60036020526000908152604090205460ff1681565b6000805460609073ffffffffffffffffffffffffffffffffffffffff163314610308576040805160e560020a62461bcd02815260206004820152601e60248201526000805160206119b5833981519152604482015290519081900360640190fd5b600084815260026020526040902054849060ff161515610360576040805160e560020a62461bcd02815260206004820152601760248201526000805160206119d5833981519152604482015290519081900360640190fd5b836040518082805190602001908083835b602083106103905780518252601f199092019160209182019101610371565b51815160209384036101000a6000190180199092169116179052604080519290940182900390912060008181526003909252929020549196505060ff161591506104269050576040805160e560020a62461bcd02815260206004820152601460248201527f426c6f636b20616c726561647920657869737473000000000000000000000000604482015290519081900360640190fd5b61043761043285610917565b61096a565b8051909250600f14610493576040805160e560020a62461bcd02815260206004820152601f60248201527f426c6f636b2048656164657220706172616d65746572206d69736d6174636800604482015290519081900360640190fd5b6000838152600360205260409020805460ff1916600117905581516104ce90839060049081106104bf57fe5b90602001906020020151610a1f565b60008481526004602052604090205581516104f090839060059081106104bf57fe5b60008481526004602090815260409182902060010192909255805187815291820185905280517f670bfcd50443d9586d8ef501b3f6fdbfaadb0a1010b4e379e4eadb74e5358b869281900390910190a15050505050565b6004602052600090815260409020805460019091015482565b60608061056f61043284610917565b80519091506005146105cb576040805160e560020a62461bcd02815260206004820152600f60248201527f4d616c666f726d65642070726f6f660000000000000000000000000000000000604482015290519081900360640190fd5b61060885856105f18460028151811015156105e257fe5b90602001906020020151610a30565b6106038560048151811015156105e257fe5b610a8a565b151561061057fe5b61065085856106278460018151811015156105e257fe5b6106398560028151811015156105e257fe5b61064b8660008151811015156105e257fe5b610bc8565b151561065857fe5b610698858561066f8460038151811015156105e257fe5b6106818560048151811015156105e257fe5b6106938660008151811015156105e257fe5b610ce7565b15156106a057fe5b6106b28160038151811015156105e257fe5b95945050505050565b60026020526000908152604090205460ff1681565b6000805473ffffffffffffffffffffffffffffffffffffffff16331461072e576040805160e560020a62461bcd02815260206004820152601e60248201526000805160206119b5833981519152604482015290519081900360640190fd5b6000809054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16639a8a05926040518163ffffffff167c0100000000000000000000000000000000000000000000000000000000028152600401602060405180830381600087803b1580156107b357600080fd5b505af11580156107c7573d6000803e3d6000fd5b505050506040513d60208110156107dd57600080fd5b505182141561085c576040805160e560020a62461bcd02815260206004820152602a60248201527f43616e6e6f7420616464207468697320636861696e20696420746f206368616960448201527f6e20726567697374657200000000000000000000000000000000000000000000606482015290519081900360840190fd5b60008281526002602052604090205460ff16156108c3576040805160e560020a62461bcd02815260206004820152601460248201527f436861696e20616c726561647920657869737473000000000000000000000000604482015290519081900360640190fd5b506000818152600260205260408120805460ff1916600190811790915580548082018255918190527fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf6909101829055919050565b61091f611961565b815160008115156109455760408051808201909152600080825260208201529250610963565b60208401905060408051908101604052808281526020018381525092505b5050919050565b60606000610976611978565b600061098185610de2565b151561098c57600080fd5b61099585610e0c565b9250826040519080825280602002602001820160405280156109d157816020015b6109be611961565b8152602001906001900390816109b65790505b5093506109dd85610e7c565b91505b6109e982610eb5565b15610a17576109f782610ed4565b8482815181101515610a0557fe5b602090810290910101526001016109e0565b505050919050565b6000610a2a82610f16565b92915050565b6020810151606090801515610a4457610a84565b806040519080825280601f01601f191660200182016040528015610a72578160200160208202803883390190505b509150610a8483600001518383610f6f565b50919050565b600084815260026020526040812054859060ff161515610ae2576040805160e560020a62461bcd02815260206004820152601760248201526000805160206119d5833981519152604482015290519081900360640190fd5b600085815260036020526040902054859060ff161515610b3a576040805160e560020a62461bcd02815260206004820152601e60248201526000805160206119b5833981519152604482015290519081900360640190fd5b610b4385610faf565b60008781526004602052604090205414610b5957fe5b610b6284610faf565b60008781526004602052604090206001015414610b7b57fe5b604080518881526020810188905260028183015290517ff0bc00f5b90f382e1bbca216713ca9e2e8e298f9d7717d30847905395f2870469181900360600190a15060019695505050505050565b600085815260026020526040812054869060ff161515610c20576040805160e560020a62461bcd02815260206004820152601760248201526000805160206119d5833981519152604482015290519081900360640190fd5b600086815260036020526040902054869060ff161515610c78576040805160e560020a62461bcd02815260206004820152601e60248201526000805160206119b5833981519152604482015290519081900360640190fd5b600087815260046020526040902054610c969087908790879061103a565b7ff0bc00f5b90f382e1bbca216713ca9e2e8e298f9d7717d30847905395f287046888860005b60408051938452602084019290925282820152519081900360600190a1506001979650505050505050565b600085815260026020526040812054869060ff161515610d3f576040805160e560020a62461bcd02815260206004820152601760248201526000805160206119d5833981519152604482015290519081900360640190fd5b600086815260036020526040902054869060ff161515610d97576040805160e560020a62461bcd02815260206004820152601e60248201526000805160206119b5833981519152604482015290519081900360640190fd5b600087815260046020526040902060010154610db89087908790879061103a565b7ff0bc00f5b90f382e1bbca216713ca9e2e8e298f9d7717d30847905395f28704688886001610cbc565b600080826020015160001415610dfb5760009150610a84565b5050515160c060009190911a101590565b600080600080600080610e1e87610de2565b1515610e2d5760009550610e72565b8651805160001a95509350610e4187611054565b840192506001876020015185010391505b818311610e6e57610e62836110d4565b90920191600101610e52565b8095505b5050505050919050565b610e84611978565b6000610e8f83610de2565b1515610e9a57600080fd5b610ea383611054565b83519383529092016020820152919050565b6000610ebf611961565b50508051602080820151915192015191011190565b610edc611961565b600080610ee884610eb5565b156100825783602001519150610efd826110d4565b8284526020808501829052838201908601529050610963565b6000806000610f2484611161565b1515610f2f57600080fd5b610f388461118a565b90925090506020811115610f4b57600080fd5b801515610f5b5760009250610963565b806020036101000a82510492505050919050565b60006020601f83010484602085015b828414610f9c57602084028281015190820152600190930192610f7e565b6000865160200187015250505050505050565b6000606080610fc061043285610917565b9150610fd48260008151811015156105e257fe5b9050806040518082805190602001908083835b602083106110065780518252601f199092019160209182019101610fe7565b5181516020939093036101000a60001901801990911692169190911790526040519201829003909120979650505050505050565b61104684848484611207565b151561104e57fe5b50505050565b600080600083602001516000141561106f5760009250610963565b50508151805160001a90608082101561108b5760009250610963565b60b88210806110a6575060c082101580156110a6575060f882105b156110b45760019250610963565b60c08210156110c95760b51982019250610963565b5060f5190192915050565b8051600090811a60808110156110ed5760019150610a84565b60b881101561110257607e1981019150610a84565b60c081101561112b57600183015160b76020839003016101000a9004810160b519019150610a84565b60f88110156111405760be1981019150610a84565b6001929092015160f76020849003016101000a900490910160f51901919050565b60008082602001516000141561117a5760009150610a84565b5050515160c060009190911a1090565b600080600080600061119b86611161565b15156111a657600080fd5b8551805160001a9350915060808310156111c657819450600193506111ff565b60b88310156111e457600186602001510393508160010194506111ff565b60b78303905080600187602001510303935080820160010194505b505050915091565b6000611211611961565b60606000806060600060606112258b610917565b96506112308761096a565b9550889450600093506112448a600061135e565b9250600091505b855182101561134f5761126586838151811015156105e257fe5b6040518082805190602001908083835b602083106112945780518252601f199092019160209182019101611275565b5181516020939093036101000a60001901801990911692169190911790526040519201829003909120881492506112d1915050576000975061134f565b6112f186838151811015156112e257fe5b9060200190602002015161096a565b9050805160111415611313576113098185858f611575565b9095509350611332565b805160021415611329576113098185858f611665565b6000975061134f565b8415156113445783600114975061134f565b60019091019061124b565b50505050505050949350505050565b60608060008061136c611999565b6040805160ff80825261012082019092526060916000919060208201611fe08038833901905050955060009450600093505b88518410156114d6576113d089858151811015156113b857fe5b90602001015160f860020a900460f860020a026116fd565b92508780156113dd575083155b15611468578251600160f860020a03191660f860020a148061142957508251600160f860020a0319167f0300000000000000000000000000000000000000000000000000000000000000145b156114635760208301518651879060ff881690811061144457fe5b906020010190600160f860020a031916908160001a9053506001850194505b6114cb565b82518651879060ff881690811061147b57fe5b906020010190600160f860020a031916908160001a90535060208301518651879060ff60018901169081106114ac57fe5b906020010190600160f860020a031916908160001a9053506002850194505b60019093019261139e565b8460ff166040519080825280601f01601f191660200182016040528015611507578160200160208202803883390190505b509150600090505b8460ff1681101561156957858181518110151561152857fe5b90602001015160f860020a900460f860020a02828281518110151561154957fe5b906020010190600160f860020a031916908160001a90535060010161150f565b50979650505050505050565b6000806000611582611961565b600086518814156115c55760006115aa876115a58c60108151811015156105e257fe5b61175e565b6115b55760006115b8565b60015b90955060ff169350611659565b86888151811015156115d357fe5b90602001015160f860020a900460f860020a0260f860020a90049250888361ffff1681518110151561160157fe5b906020019060200201519150600188019750602061161e83610a30565b51101561163a5761163182898989611820565b98509050611652565b61164f898461ffff168151811015156104bf57fe5b90505b8088945094505b50505094509492505050565b600080606080600061168e89600081518110151561167f57fe5b90602001906020020151611877565b925061169b83600161135e565b5187519801978814156116c05760006115aa876115a58c600181518110151561167f57fe5b6116cb83600161135e565b5115156116de5760009450849350611659565b6116f089600181518110151561167f57fe5b915061164f8260006118da565b611705611999565b600080611713846004611934565b60408051808201909152600160f860020a03199190911681527f0f00000000000000000000000000000000000000000000000000000000000000949094166020850152509192915050565b6000816040518082805190602001908083835b602083106117905780518252601f199092019160209182019101611771565b51815160209384036101000a6000190180199092169116179052604051919093018190038120885190955088945090928392508401908083835b602083106117e95780518252601f1990920191602091820191016117ca565b5181516020939093036101000a60001901801990911692169190911790526040519201829003909120939093149695505050505050565b600080606061182e8761096a565b905080516011141561184f5761184681878787611575565b9250925061186d565b8051600214156118655761184681878787611665565b600092508291505b5094509492505050565b606060008061188584611161565b151561189057600080fd5b6118998461118a565b60408051828152601f19601f840116810160200190915291935091508180156118cc578160200160208202803883390190505b509250610963828483610f6f565b600080805b602081101561192c5780600802858286018151811015156118fc57fe5b60209101015160029190910a60f860020a91829004909102600160f860020a0319160491909117906001016118df565b509392505050565b600060ff80831660020a81169060f860020a85041681151561195257fe5b0460f860020a02905092915050565b604080518082019091526000808252602082015290565b60606040519081016040528061198c611961565b8152602001600081525090565b604080518082018252906002908290803883395091929150505600426c6f636b20646f6573206e6f7420657869737420666f7220636861696e0000436861696e206973206e6f742072656769737465726564000000000000000000a165627a7a723058204f543f58cf31c9b56030285bca0bdc7e6cf385663c4f6c01bdf5fc3cab3ae3da0029";

    public static final String FUNC_REGISTEREDCHAINS = "registeredChains";

    public static final String FUNC_M_BLOCKHASHES = "m_blockhashes";

    public static final String FUNC_ADDBLOCK = "addBlock";

    public static final String FUNC_M_BLOCKHEADERS = "m_blockheaders";

    public static final String FUNC_CHECKPROOFS = "CheckProofs";

    public static final String FUNC_M_CHAINS = "m_chains";

    public static final String FUNC_ADDCHAIN = "addChain";

    public static final Event BLOCKADDED_EVENT = new Event("BlockAdded", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Bytes32>() {}));
    ;

    public static final Event VERIFIEDPROOF_EVENT = new Event("VerifiedProof", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Bytes32>() {}, new TypeReference<Uint256>() {}));
    ;

    @Deprecated
    protected EthereumStore(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected EthereumStore(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected EthereumStore(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected EthereumStore(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<byte[]> registeredChains(BigInteger param0) {
        final Function function = new Function(FUNC_REGISTEREDCHAINS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}));
        return executeRemoteCallSingleValueReturn(function, byte[].class);
    }

    public RemoteCall<Boolean> m_blockhashes(byte[] param0) {
        final Function function = new Function(FUNC_M_BLOCKHASHES, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> addBlock(byte[] _chainId, byte[] _blockBlob) {
        final Function function = new Function(
                FUNC_ADDBLOCK, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_chainId), 
                new org.web3j.abi.datatypes.DynamicBytes(_blockBlob)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Tuple2<byte[], byte[]>> m_blockheaders(byte[] param0) {
        final Function function = new Function(FUNC_M_BLOCKHEADERS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bytes32>() {}, new TypeReference<Bytes32>() {}));
        return new RemoteCall<Tuple2<byte[], byte[]>>(
                new Callable<Tuple2<byte[], byte[]>>() {
                    @Override
                    public Tuple2<byte[], byte[]> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<byte[], byte[]>(
                                (byte[]) results.get(0).getValue(), 
                                (byte[]) results.get(1).getValue());
                    }
                });
    }

    public RemoteCall<TransactionReceipt> CheckProofs(byte[] _chainId, byte[] _blockHash, byte[] _proof) {
        final Function function = new Function(
                FUNC_CHECKPROOFS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_chainId), 
                new org.web3j.abi.datatypes.generated.Bytes32(_blockHash), 
                new org.web3j.abi.datatypes.DynamicBytes(_proof)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Boolean> m_chains(byte[] param0) {
        final Function function = new Function(FUNC_M_CHAINS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(param0)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Bool>() {}));
        return executeRemoteCallSingleValueReturn(function, Boolean.class);
    }

    public RemoteCall<TransactionReceipt> addChain(byte[] _chainId) {
        final Function function = new Function(
                FUNC_ADDCHAIN, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Bytes32(_chainId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public List<BlockAddedEventResponse> getBlockAddedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(BLOCKADDED_EVENT, transactionReceipt);
        ArrayList<BlockAddedEventResponse> responses = new ArrayList<BlockAddedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            BlockAddedEventResponse typedResponse = new BlockAddedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.chainId = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.blockHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<BlockAddedEventResponse> blockAddedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, BlockAddedEventResponse>() {
            @Override
            public BlockAddedEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(BLOCKADDED_EVENT, log);
                BlockAddedEventResponse typedResponse = new BlockAddedEventResponse();
                typedResponse.log = log;
                typedResponse.chainId = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.blockHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<BlockAddedEventResponse> blockAddedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(BLOCKADDED_EVENT));
        return blockAddedEventFlowable(filter);
    }

    public List<VerifiedProofEventResponse> getVerifiedProofEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(VERIFIEDPROOF_EVENT, transactionReceipt);
        ArrayList<VerifiedProofEventResponse> responses = new ArrayList<VerifiedProofEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            VerifiedProofEventResponse typedResponse = new VerifiedProofEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.chainId = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.blockHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
            typedResponse.proofType = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<VerifiedProofEventResponse> verifiedProofEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new io.reactivex.functions.Function<Log, VerifiedProofEventResponse>() {
            @Override
            public VerifiedProofEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(VERIFIEDPROOF_EVENT, log);
                VerifiedProofEventResponse typedResponse = new VerifiedProofEventResponse();
                typedResponse.log = log;
                typedResponse.chainId = (byte[]) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.blockHash = (byte[]) eventValues.getNonIndexedValues().get(1).getValue();
                typedResponse.proofType = (BigInteger) eventValues.getNonIndexedValues().get(2).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<VerifiedProofEventResponse> verifiedProofEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(VERIFIEDPROOF_EVENT));
        return verifiedProofEventFlowable(filter);
    }

    @Deprecated
    public static EthereumStore load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new EthereumStore(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static EthereumStore load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new EthereumStore(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static EthereumStore load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new EthereumStore(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static EthereumStore load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new EthereumStore(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<EthereumStore> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _ionAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_ionAddr)));
        return deployRemoteCall(EthereumStore.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<EthereumStore> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _ionAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_ionAddr)));
        return deployRemoteCall(EthereumStore.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<EthereumStore> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _ionAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_ionAddr)));
        return deployRemoteCall(EthereumStore.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<EthereumStore> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _ionAddr) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_ionAddr)));
        return deployRemoteCall(EthereumStore.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static class BlockAddedEventResponse {
        public Log log;

        public byte[] chainId;

        public byte[] blockHash;
    }

    public static class VerifiedProofEventResponse {
        public Log log;

        public byte[] chainId;

        public byte[] blockHash;

        public BigInteger proofType;
    }
}