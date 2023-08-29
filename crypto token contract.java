// SPDX-Licensesolidity 0.8.18;

contract MyToken {
    string public name;          // Token Name
    string public symbol;        // Token Abbreviation
    uint256 public totalSupply;  // Total Supply

    mapping(address => uint256) public balances;

    constructor(string memory _name, string memory _symbol, uint256 _totalSupply) {
        name = _name;
        symbol = _symbol;
        totalSupply = _totalSupply;
        balances[msg.sender] = _totalSupply;
    }

    function mint(address account, uint256 amount) public {
        require(account != address(0), "Invalid address");
        totalSupply += amount;
        balances[account] += amount;
    }

    function burn(address account, uint256 amount) public {
        require(account != address(0), "Invalid address");
        require(balances[account >= amount, "Insufficient balance");
        
        totalSupply -= amount;
        balances[account] -= amount;
    }
}