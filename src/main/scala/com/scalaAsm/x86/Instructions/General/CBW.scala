package com.scalaAsm.x86
package Instructions
package General

// Description: Convert Byte to Word
// Category: general/conver

trait CBW extends InstructionDefinition {
  val mnemonic = "CBW"
}

object CBW extends ZeroOperands[CBW] with CBWImpl

trait CBWImpl extends CBW {
  implicit object _0 extends NoOp{
    val opcode: OneOpcode = 0x98
        override def hasImplicitOperand = true
  }
}
