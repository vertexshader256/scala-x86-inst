package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: CPU Identification
// Category: general/control

trait CPUID extends InstructionDefinition {
  val mnemonic = "CPUID"
}

object CPUID extends ZeroOperands[CPUID] with CPUIDImpl

trait CPUIDImpl extends CPUID {
  implicit object _0 extends NoOp{
    val opcode: TwoOpcodes = (0x0F, 0xA2)
        override def hasImplicitOperand = true
  }
}
